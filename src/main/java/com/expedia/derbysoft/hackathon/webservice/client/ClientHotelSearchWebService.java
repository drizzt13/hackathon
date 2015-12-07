package com.expedia.derbysoft.hackathon.webservice.client;

import com.expedia.derbysoft.hackathon.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.dto.HotelSearchRS;
import com.expedia.derbysoft.hackathon.utils.JsonUtils;
import com.expedia.derbysoft.hackathon.utils.http.HttpClientUtils;
import com.expedia.derbysoft.hackathon.webservice.HotelSearchWebService;
import com.expedia.derbysoft.hackathon.webservice.util.ResponseHelper;

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

    private String getResponse(HotelSearchRQ request) {
        return HttpClientUtils.getResult(url, request.getParameterMap());
    }
}
