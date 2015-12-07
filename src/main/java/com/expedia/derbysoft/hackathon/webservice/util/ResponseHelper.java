package com.expedia.derbysoft.hackathon.webservice.util;


import com.expedia.derbysoft.hackathon.dto.ErrorDTO;
import com.expedia.derbysoft.hackathon.dto.HotelSearchRS;

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
