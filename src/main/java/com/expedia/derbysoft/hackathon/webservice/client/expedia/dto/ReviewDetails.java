package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

public class ReviewDetails {

    private Integer startIndex;

    private Integer numberOfReviewsInThisPage;

    private ReviewSummaryCollection reviewSummaryCollection;

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getNumberOfReviewsInThisPage() {
        return numberOfReviewsInThisPage;
    }

    public void setNumberOfReviewsInThisPage(Integer numberOfReviewsInThisPage) {
        this.numberOfReviewsInThisPage = numberOfReviewsInThisPage;
    }

    public ReviewSummaryCollection getReviewSummaryCollection() {
        return reviewSummaryCollection;
    }

    public void setReviewSummaryCollection(ReviewSummaryCollection reviewSummaryCollection) {
        this.reviewSummaryCollection = reviewSummaryCollection;
    }
}
