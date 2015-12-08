package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import java.util.List;

/**
 * Created by zhupan on 12/7/15.
 */
public class ReviewSummaryCollection {

    private List<ReviewSummary> reviewSummary;

    public List<ReviewSummary> getReviewSummary() {
        return reviewSummary;
    }

    public void setReviewSummary(List<ReviewSummary> reviewSummary) {
        this.reviewSummary = reviewSummary;
    }
}
