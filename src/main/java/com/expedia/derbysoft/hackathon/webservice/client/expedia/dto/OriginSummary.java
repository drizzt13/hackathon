package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import java.math.BigDecimal;

/**
 * Created by zhupan on 12/7/15.
 */
public class OriginSummary {

    private String origin;

    private Integer reviewCnt;

    private BigDecimal recommendedPercent;

    private BigDecimal avgOverallRating;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getReviewCnt() {
        return reviewCnt;
    }

    public void setReviewCnt(Integer reviewCnt) {
        this.reviewCnt = reviewCnt;
    }

    public BigDecimal getRecommendedPercent() {
        return recommendedPercent;
    }

    public void setRecommendedPercent(BigDecimal recommendedPercent) {
        this.recommendedPercent = recommendedPercent;
    }

    public BigDecimal getAvgOverallRating() {
        return avgOverallRating;
    }

    public void setAvgOverallRating(BigDecimal avgOverallRating) {
        this.avgOverallRating = avgOverallRating;
    }
}
