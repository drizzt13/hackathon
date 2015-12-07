package com.expedia.derbysoft.hackathon.webservice.client.expedia;

import com.expedia.derbysoft.hackathon.utils.Environments;
import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import com.expedia.derbysoft.hackathon.utils.http.HttpClientUtils;
import com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelSearchSummary;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;

/**
 * Created by zhupan on 12/7/15.
 */
public class HotelSearchClient {

    public HotelSearchSummary search(HotelSearchRQ rq) {
        String hotelSearchURL = Environments.getHotelSearchURL(rq.getLocation(), rq.getRadius(), rq.getDates());
        String rs = HttpClientUtils.getResult(hotelSearchURL);
        return JsonUtils.unmarshal(rs, HotelSearchSummary.class);
    }

}
