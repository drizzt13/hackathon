package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

public class HotelSearchSummary {

    private Integer matchingHotelCount;
    private Integer hotelCount;
    private StayDates StayDates;

    private HotelInfoList HotelInfoList;

    public HotelSearchSummary() {
    }

    public Integer getMatchingHotelCount() {
        return matchingHotelCount;
    }

    public void setMatchingHotelCount(Integer matchingHotelCount) {
        this.matchingHotelCount = matchingHotelCount;
    }

    public Integer getHotelCount() {
        return hotelCount;
    }

    public void setHotelCount(Integer hotelCount) {
        this.hotelCount = hotelCount;
    }

    public com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.StayDates getStayDates() {
        return StayDates;
    }

    public void setStayDates(com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.StayDates stayDates) {
        StayDates = stayDates;
    }

    public com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelInfoList getHotelInfoList() {
        return HotelInfoList;
    }

    public void setHotelInfoList(com.expedia.derbysoft.hackathon.webservice.client.expedia.dto.HotelInfoList hotelInfoList) {
        HotelInfoList = hotelInfoList;
    }
}

