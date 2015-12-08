package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.utils.BigDecimals;
import com.expedia.derbysoft.hackathon.utils.latlng.LatLngs;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelInfo;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelSearchSummary;
import com.expedia.derbysoft.hackathon.webservice.dto.GeoLocation;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelDTO;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhupan on 12/7/15.
 */
public class MatchedRatingService {

    public HotelSearchRS translate(HotelSearchSummary hotelSearchSummary, HotelSearchRQ request) {
        HotelSearchRS rs = new HotelSearchRS();
        if (hotelSearchSummary == null || hotelSearchSummary.getHotelInfoList() == null || hotelSearchSummary.getHotelInfoList().getHotelInfo() == null) {
            return rs;
        }
        List<HotelDTO> hotels = hotelSearchSummary.getHotelInfoList().getHotelInfo().stream().map(hotelInfo -> translateHotelDTO(hotelInfo, request.getGeoLocation())).collect(Collectors.toList());
        Collections.sort(hotels, (h1, h2) -> h2.getMatchedRating().compareTo(h1.getMatchedRating()));
        rs.setHotels(hotels);
        return rs;
    }

    private HotelDTO translateHotelDTO(HotelInfo hotelInfo, GeoLocation location) {
        HotelDTO hotelDTO = new HotelDTO();
        if (hotelInfo.getPrice() != null) {
            hotelDTO.setBaseRate(hotelInfo.getPrice().getBaseRate().getValue());
        }
        hotelDTO.setDetailsUrl(hotelInfo.getDetailsUrl());
        hotelDTO.setHotelID(hotelInfo.getHotelID());
        hotelDTO.setHotelName(hotelInfo.getName());
        hotelDTO.setThumbnailUrl(hotelInfo.getThumbnailUrl());
        GeoLocation hotelLocation = hotelInfo.getLocation().getGeoLocation();
        hotelDTO.setLocation(hotelLocation);
        double distance = LatLngs.distance(location.getLatitude(), location.getLongitude(), hotelLocation.getLatitude(), hotelLocation.getLongitude());
        hotelDTO.setDistance(BigDecimals.roundUp(distance / 1000));
        BigDecimal guestRating = BigDecimal.ZERO;
        if (hotelInfo.getGuestRating() != null) {
            guestRating = new BigDecimal(hotelInfo.getGuestRating());
        }
        hotelDTO.setMatchedRating(MatchedRatingCalculator.calculate(hotelDTO.getDistance(), guestRating));
        return hotelDTO;
    }

}
