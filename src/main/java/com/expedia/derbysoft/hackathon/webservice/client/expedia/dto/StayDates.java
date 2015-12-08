package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

/**
 * Created by zhupan on 12/7/15.
 */
public class StayDates {

    private String checkInDate;

    private String checkOutDate;

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
