package com.expedia.derbysoft.hackathon.webservice.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelSearchRS {

    private List<HotelDTO> hotels = new ArrayList<HotelDTO>();

    public List<HotelDTO> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDTO> hotels) {
        this.hotels = hotels;
    }

    private ErrorDTO error;

    public ErrorDTO getError() {
        return error;
    }

    public void setError(ErrorDTO error) {
        this.error = error;
    }
}
