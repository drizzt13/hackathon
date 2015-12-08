package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zhupan on 12/7/15.
 */
public class ReviewSummary {

    private String hotelId;

    private Integer totalReviewCnt;

    private BigDecimal avgOverallRating;

    private BigDecimal cleanliness;

    private BigDecimal serviceAndStaff;

    private BigDecimal roomComfort;

    private BigDecimal hotelCondition;

    private BigDecimal convenienceOfLocation;

    private BigDecimal neighborhoodSatisfaction;

    private Integer roomQuality;

    private String targetedBrand;

    private List<OriginSummary> originSummary;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getTotalReviewCnt() {
        return totalReviewCnt;
    }

    public void setTotalReviewCnt(Integer totalReviewCnt) {
        this.totalReviewCnt = totalReviewCnt;
    }

    public BigDecimal getAvgOverallRating() {
        return avgOverallRating;
    }

    public void setAvgOverallRating(BigDecimal avgOverallRating) {
        this.avgOverallRating = avgOverallRating;
    }

    public BigDecimal getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(BigDecimal cleanliness) {
        this.cleanliness = cleanliness;
    }

    public BigDecimal getServiceAndStaff() {
        return serviceAndStaff;
    }

    public void setServiceAndStaff(BigDecimal serviceAndStaff) {
        this.serviceAndStaff = serviceAndStaff;
    }

    public BigDecimal getRoomComfort() {
        return roomComfort;
    }

    public void setRoomComfort(BigDecimal roomComfort) {
        this.roomComfort = roomComfort;
    }

    public BigDecimal getHotelCondition() {
        return hotelCondition;
    }

    public void setHotelCondition(BigDecimal hotelCondition) {
        this.hotelCondition = hotelCondition;
    }

    public BigDecimal getConvenienceOfLocation() {
        return convenienceOfLocation;
    }

    public void setConvenienceOfLocation(BigDecimal convenienceOfLocation) {
        this.convenienceOfLocation = convenienceOfLocation;
    }

    public BigDecimal getNeighborhoodSatisfaction() {
        return neighborhoodSatisfaction;
    }

    public void setNeighborhoodSatisfaction(BigDecimal neighborhoodSatisfaction) {
        this.neighborhoodSatisfaction = neighborhoodSatisfaction;
    }

    public Integer getRoomQuality() {
        return roomQuality;
    }

    public void setRoomQuality(Integer roomQuality) {
        this.roomQuality = roomQuality;
    }

    public String getTargetedBrand() {
        return targetedBrand;
    }

    public void setTargetedBrand(String targetedBrand) {
        this.targetedBrand = targetedBrand;
    }

    public List<OriginSummary> getOriginSummary() {
        return originSummary;
    }

    public void setOriginSummary(List<OriginSummary> originSummary) {
        this.originSummary = originSummary;
    }
}
