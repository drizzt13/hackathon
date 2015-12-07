package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.webservice.HotelSearchWebService;
import com.expedia.derbysoft.hackathon.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.dto.HotelSearchRS;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelSearchWebServiceImpl implements HotelSearchWebService {

    @Override
    public HotelSearchRS search(HotelSearchRQ request) {
        HotelSearchRS response = new HotelSearchRS();
        return response;
    }


}
