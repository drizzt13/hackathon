package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.webservice.HotelSearchWebService;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.ExpediaAPIClient;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelSearchSummary;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelSearchWebServiceImpl implements HotelSearchWebService {

    private ExpediaAPIClient expediaAPIClient = new ExpediaAPIClient();

    private MatchedRatingService matchedRatingService = new MatchedRatingService();

    @Override
    public HotelSearchRS search(HotelSearchRQ request) {
        HotelSearchSummary hotelSearchSummary = expediaAPIClient.search(request);
        return matchedRatingService.translate(hotelSearchSummary,request);
    }

    public void setExpediaAPIClient(ExpediaAPIClient expediaAPIClient) {
        this.expediaAPIClient = expediaAPIClient;
    }

    public void setMatchedRatingService(MatchedRatingService matchedRatingService) {
        this.matchedRatingService = matchedRatingService;
    }
}
