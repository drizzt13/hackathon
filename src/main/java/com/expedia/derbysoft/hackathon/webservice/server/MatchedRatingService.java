package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelInfo;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelSearchSummary;
import com.expedia.derbysoft.hackathon.webservice.dto.GeoLocation;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelDTO;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;

import java.math.BigDecimal;
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
        rs.setHotels(hotels);
        return rs;
    }

    private HotelDTO translateHotelDTO(HotelInfo hotelInfo, GeoLocation geoLocation) {
        HotelDTO hotelDTO = new HotelDTO();
        if (hotelInfo.getPrice() != null) {
            hotelDTO.setBaseRate(hotelInfo.getPrice().getBaseRate().getValue());
        }
        hotelDTO.setDetailsUrl(hotelInfo.getDetailsUrl());
        hotelDTO.setHotelID(hotelInfo.getHotelID());
        hotelDTO.setHotelName(hotelInfo.getName());
        hotelDTO.setThumbnailUrl(hotelInfo.getThumbnailUrl());
        hotelDTO.setLocation(hotelInfo.getLocation().getGeoLocation());
        hotelDTO.setMatchedRating(BigDecimal.ONE);
        hotelDTO.setDistance(BigDecimal.ONE);
        return hotelDTO;
    }

}