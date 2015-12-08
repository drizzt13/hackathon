package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.webservice.client.expedia.ExpediaAPIClient;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.ReviewDetails;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.ReviewSummary;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhupan on 12/7/15.
 */
public class ReviewsRatingService {

    private ExpediaAPIClient expediaAPIClient = new ExpediaAPIClient();

    public Map<String, BigDecimal> getReviewRating(List<String> hotelIds) {
        Map<String, BigDecimal> result = new HashMap<>();
        for (String hotelId : hotelIds) {
            ReviewDetails reviewDetails = expediaAPIClient.findReview(hotelId);
            List<ReviewSummary> reviewSummary = reviewDetails.getReviewSummaryCollection().getReviewSummary();
            if (reviewSummary != null && reviewSummary.isEmpty()) {
                BigDecimal avgOverallRating = reviewSummary.get(0).getAvgOverallRating();
                if (avgOverallRating != null) {
                    result.put(hotelId, avgOverallRating);
                    continue;
                }
                result.put(hotelId, BigDecimal.ZERO);
            }
        }
        return result;
    }

    public void setExpediaAPIClient(ExpediaAPIClient expediaAPIClient) {
        this.expediaAPIClient = expediaAPIClient;
    }
}
