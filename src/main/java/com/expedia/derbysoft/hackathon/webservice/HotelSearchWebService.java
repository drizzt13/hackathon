package com.expedia.derbysoft.hackathon.webservice;

import com.expedia.derbysoft.hackathon.webservice.server.dto.HotelSearchRQ;
import com.expedia.derbysoft.hackathon.webservice.server.dto.HotelSearchRS;

/**
 * Created by zhupan on 12/8/15.
 */
public interface HotelSearchWebService {

    HotelSearchRS search(HotelSearchRQ request);

}
