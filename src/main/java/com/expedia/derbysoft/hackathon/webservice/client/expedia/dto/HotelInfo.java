package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

/**
 * Created by zhupan on 12/7/15.
 */
public class HotelInfo {

    private String hotelID;

    private String name;

    private Location location;

    private String description;

    private String statusCode;

    private Price price;

    private String detailsUrl;

    private String starRating;

    private String thumbnailUrl;

    private String guestRating;

    private String guestReviewCount;

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getGuestRating() {
        return guestRating;
    }

    public void setGuestRating(String guestRating) {
        this.guestRating = guestRating;
    }

    public String getGuestReviewCount() {
        return guestReviewCount;
    }

    public void setGuestReviewCount(String guestReviewCount) {
        this.guestReviewCount = guestReviewCount;
    }
}
