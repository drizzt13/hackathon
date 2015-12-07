package com.expedia.derbysoft.hackathon.webservice.server.dto;

import com.expedia.derbysoft.hackathon.hotel.GeoLocation;

import java.math.BigDecimal;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelDTO {

    private String HotelID;

    private String HotelName;

    private GeoLocation location;

    private BigDecimal baseRate;

    private String detailsUrl;

    private String thumbnailUrl;

    private BigDecimal matchedRating;

    private BigDecimal distance;

    public String getHotelID() {
        return HotelID;
    }

    public void setHotelID(String hotelID) {
        HotelID = hotelID;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public GeoLocation getLocation() {
        return location;
    }

    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public BigDecimal getMatchedRating() {
        return matchedRating;
    }

    public void setMatchedRating(BigDecimal matchedRating) {
        this.matchedRating = matchedRating;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }
}
