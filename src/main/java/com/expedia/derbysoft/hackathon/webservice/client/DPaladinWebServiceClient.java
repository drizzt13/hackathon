package com.expedia.derbysoft.hackathon.webservice.client;

import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import com.expedia.derbysoft.hackathon.utils.http.HttpClientUtils;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;
import com.expedia.derbysoft.hackathon.webservice.server.ResponseHelper;

/**
 * Created by zhupan on 12/8/15.
 */
public class DPaladinWebServiceClient {

    private String url;

    public DPaladinWebServiceClient(String url) {
        this.url = url;
    }

    public HotelSearchRS search() {
        try {
            String response = HttpClientUtils.getResult(url);
            return JsonUtils.unmarshal(response, HotelSearchRS.class);
        } catch (Exception e) {
            return ResponseHelper.response(e);
        }
    }

}
