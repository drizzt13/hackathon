package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.utils.BigDecimals;
import com.expedia.derbysoft.hackathon.utils.Environments;
import com.expedia.derbysoft.hackathon.utils.latlng.LatLngs;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.ExpediaAPIClient;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelInfo;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelSearchSummary;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.ReviewDetails;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.ReviewSummary;
import com.expedia.derbysoft.hackathon.webservice.dto.GeoLocation;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelDTO;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhupan on 12/7/15.
 */
public class MatchedRatingService {

    private ExpediaAPIClient expediaAPIClient = new ExpediaAPIClient();

    public HotelSearchRS translate(HotelSearchSummary hotelSearchSummary, HotelSearchRQ request) {
        HotelSearchRS rs = new HotelSearchRS();
        if (hotelSearchSummary == null || hotelSearchSummary.getHotelInfoList() == null || hotelSearchSummary.getHotelInfoList().getHotelInfo() == null) {
            return rs;
        }
        List<HotelDTO> hotels = new ArrayList<>();
        for (HotelInfo hotelInfo : hotelSearchSummary.getHotelInfoList().getHotelInfo()) {
            HotelDTO hotelDTO = translateHotelDTO(hotelInfo, request.getGeoLocation());
            if (hotelDTO == null) {
                continue;
            }
            hotels.add(hotelDTO);
        }
        Collections.sort(hotels, (h1, h2) -> h2.getMatchedRating().compareTo(h1.getMatchedRating()));
        rs.setHotels(hotels);
        return rs;
    }

    private HotelDTO translateHotelDTO(HotelInfo hotelInfo, GeoLocation searchLocation) {
        if (hotelInfo.getPrice() == null || hotelInfo.getPrice().getBaseRate() == null) {
            return null;
        }
        HotelDTO hotelDTO = new HotelDTO();
        hotelDTO.setBaseRate(hotelInfo.getPrice().getBaseRate().getValue());
        hotelDTO.setDetailsUrl(hotelInfo.getDetailsUrl());
        hotelDTO.setHotelID(hotelInfo.getHotelID());
        hotelDTO.setHotelName(hotelInfo.getName());
        hotelDTO.setThumbnailUrl(hotelInfo.getThumbnailUrl());
        hotelDTO.setGuestRating(hotelInfo.getGuestRating());
        hotelDTO.setLocation(hotelInfo.getLocation().getGeoLocation());
        hotelDTO.setDistance(getDistance(searchLocation, hotelInfo.getLocation().getGeoLocation()));
        hotelDTO.setMatchedRating(MatchedRatingCalculator.calculate(hotelDTO.getDistance(), getGuestRating(hotelInfo)));
        return hotelDTO;
    }

    private BigDecimal getDistance(GeoLocation searchLocation, GeoLocation hotelLocation) {
        double distance = LatLngs.distance(searchLocation.getLatitude(), searchLocation.getLongitude(), hotelLocation.getLatitude(), hotelLocation.getLongitude());
        return BigDecimals.roundUp(distance / 1000);
    }

    private BigDecimal getGuestRating(HotelInfo hotelInfo) {
        BigDecimal guestRating = BigDecimal.ZERO;
        if (hotelInfo.getGuestRating() != null) {
            guestRating = hotelInfo.getGuestRating();
        }
        if (Environments.reviewsRatingRequired() && guestRating.equals(BigDecimal.ZERO)) {
            ReviewDetails reviewDetails = expediaAPIClient.findReview(hotelInfo.getHotelID());
            List<ReviewSummary> reviewSummary = reviewDetails.getReviewSummaryCollection().getReviewSummary();
            if (reviewSummary != null && reviewSummary.isEmpty()) {
                BigDecimal avgOverallRating = reviewSummary.get(0).getAvgOverallRating();
                System.out.println(hotelInfo.getHotelID() + "-" + avgOverallRating);
                if (avgOverallRating != null) {
                    guestRating = avgOverallRating;
                }
            }
        }
        return guestRating;
    }

    public void setExpediaAPIClient(ExpediaAPIClient expediaAPIClient) {
        this.expediaAPIClient = expediaAPIClient;
    }
}
