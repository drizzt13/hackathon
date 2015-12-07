package com.expedia.derbysoft.hackathon.webservice.client;

import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import com.expedia.derbysoft.hackathon.utils.http.HttpClientUtils;
import com.expedia.derbysoft.hackathon.webservice.HotelSearchWebService;
import com.expedia.derbysoft.hackathon.webservice.server.ResponseHelper;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;

import java.util.HashMap;

/**
 * Created by zhupan on 12/8/15.
 */
public class ClientHotelSearchWebService implements HotelSearchWebService {

    private String url;

    public ClientHotelSearchWebService(String url) {
        this.url = url;
    }

    @Override
    public HotelSearchRS search(HotelSearchRQ request) {
        try {
            return (HotelSearchRS) JsonUtils.unmarshal(getResponse(request));
        } catch (Exception e) {
            return ResponseHelper.response(e);
        }
    }

    public HotelSearchRS search() {
        try {
            return (HotelSearchRS) JsonUtils.unmarshal(HttpClientUtils.getResult(url, new HashMap<>()));
        } catch (Exception e) {
            return ResponseHelper.response(e);
        }
    }

    private String getResponse(HotelSearchRQ request) {
        return HttpClientUtils.getResult(url, request.getParameterMap());
    }
}
