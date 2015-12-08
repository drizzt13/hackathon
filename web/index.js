function mainController($scope) {
	$scope.q = "Los Vegas";
	$scope.location = {lat: 37.777363, lng:-122.453269}
	$scope.distance = "5km";
	
	$scope.map;
	$scope.geocoder;
	$scope.poiHeatMap;
	$scope.poiList;
	$scope.marker;
	$scope.hotelMarkers = [];

	$scope.search = function() {
		$scope.geocoder.geocode({address: $scope.q},function(datas, geocoderStatus){
				if(geocoderStatus == "OK"){
					var data = datas[0];
				
					var location = data.geometry.location;
					$scope.map.setCenter(location);
					
					$scope.location = {lat: location.lat(), lng:location.lng()}
					$scope.refreshPoiHeatMap();
					$scope.marker = new google.maps.Marker({
						position: {lat: $scope.location.lat, lng: $scope.location.lng},
						map: $scope.map,
						draggable: true,
						title: "Drag me to your destination!"
					});
					
					$scope.searchHotels();
					return;
				} else {
					alert("Find location failed");
				}
				$scope.$apply();
			});
	}
	
	$scope.refreshPoiHeatMap = function() {
		$scope.poiList = [];
		var location = $scope.location;
		$.ajax({
            url: "http://terminal2.expedia.com/x/geo/features?within=" + $scope.distance + "&lng=" + location.lng + "&lat=" + location.lat + "&type=point_of_interest&apikey=WltUr2qzCzN7qx6NXjeErX5vNpWbq6r8",
            type: "GET",
            context: document.body,
            dataType: "json",
            processData: false,
            async: true,
            success: function(result) {
				var poiLocations = []
				$.each(result, function(index, item) {
					var poiLocation = new google.maps.LatLng(item.position.coordinates[1], item.position.coordinates[0]);
					poiLocations.push(poiLocation);
					$scope.poiList.push({location: {lat: item.position.coordinates[1], lng: item.position.coordinates[0]}, name: shortName(item.name)});
				})
				$scope.poiHeatMap = new google.maps.visualization.HeatmapLayer({
					data: poiLocations,
					map: $scope.map
				});
				$scope.$apply();
            },
            error: function(jqXHR, textStatus, errorThrown) {
                //handleError(errorThrown);
            }
        });
	}
	
	function shortName(name) {
		if(name.indexOf(",") > -1) {
			return name.substring(0, name.indexOf(","))
		}
		return name;
	}
	
	function addMarker(location, icon) {
		return new google.maps.Marker({
			position: {lat: location.lat, lng: location.lng},
			map: $scope.map,
			icon: icon
		});
	}
	
	$scope.searchHotels = function() {
		$.ajax({
            url: "/dpaladin/hotelsearch?location=" + $scope.location.lat + "," + $scope.location.lng + "&radius=" + $scope.distance + "&dates=2015-12-31,2016-01-01",
            type: "GET",
            context: document.body,
            dataType: "json",
            processData: false,
            async: true,
            success: function(result) {
				clearMarkers($scope.hotelMarkers);
				$scope.hotelMarkers = []
				$scope.hotels = [];
				var hotelLocations = []
				$.each(result.hotels, function(index, hotel) {
					var location = {lat:hotel.location.latitude, lng: hotel.location.longitude};
					if(hotel.matchedRating > 4) {
						$scope.hotelMarkers.push(addMarker(location, "hotel_blue.png"))
					} else if (hotel.matchedRating > 3) {
						$scope.hotelMarkers.push(addMarker(location, "hotel_red.png"))
					} else if (hotel.matchedRating > 2) {
						$scope.hotelMarkers.push(addMarker(location, "hotel_green.png"))
					}
					
					if($scope.hotels.length < 6) {
						if(hotel.detailsUrl != null) {
							$scope.hotels.push(hotel);
						}
					}
				})
				$scope.$apply();
            },
            error: function(jqXHR, textStatus, errorThrown) {
                //handleError(errorThrown);
            }
        });
	}
	
	function clearMarkers(markers) {
	  for (var i = 0; i < markers.length; i++) {
		markers[i].setMap(null);
	  }
	  markers = [];
	}
	
	$scope.selectPoi = function(poi) {
		$.each($scope.poiList, function(index, eachPoi) {
			eachPoi.selected = false;
		})
		poi.selected = true;
		$scope.location = poi.location;
		var latLng = new google.maps.LatLng($scope.location.lat, $scope.location.lng);
		$scope.marker.setPosition(latLng);
		$scope.map.setCenter(latLng);
		
		$scope.searchHotels();
	}
	
	$scope.initMap = function() {
		$scope.map = new google.maps.Map(document.getElementById('map'), {
			center: {lat: $scope.location.lat, lng: $scope.location.lng},
			zoom: 14
		});
		$scope.geocoder = new google.maps.Geocoder();
	}
	$scope.initMap();
}