package com.expedia.derbysoft.hackathon.webservice.client.expedia;

import com.expedia.derbysoft.hackathon.utils.Environments;
import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import com.expedia.derbysoft.hackathon.utils.http.HttpClientUtils;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelReviews;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelSearchSummary;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.ReviewDetails;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;

/**
 * Created by zhupan on 12/7/15.
 */
public class ExpediaAPIClient {

    public HotelSearchSummary search(HotelSearchRQ rq) {
        String hotelSearchURL = Environments.getHotelSearchURL(rq.getLocation(), rq.getRadius(), rq.getDates());
        String rs = HttpClientUtils.getResult(hotelSearchURL);
        return JsonUtils.unmarshal(rs, HotelSearchSummary.class);
    }

    public ReviewDetails findReview(String hotelId) {
        String reviewsURL = Environments.getReviewsURL(hotelId);
        String rs = HttpClientUtils.getResult(reviewsURL);
        HotelReviews hotelReviews = JsonUtils.unmarshal(rs, HotelReviews.class);
        return hotelReviews.getReviewDetails();
    }

}
