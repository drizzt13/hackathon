package com.expedia.derbysoft.hackathon.webservice.server;


import com.expedia.derbysoft.hackathon.webservice.dto.ErrorDTO;
import com.expedia.derbysoft.hackathon.webservice.dto.HotelSearchRS;

public abstract class ResponseHelper {

    public static HotelSearchRS response(Throwable e) {
        HotelSearchRS response = new HotelSearchRS();
        response.setError(error(e));
        return response;
    }

    private static ErrorDTO error(Throwable e) {
        ErrorDTO error = new ErrorDTO();
        error.setCode("System");
        error.setMessage(e.getMessage());
        return error;
    }

}
