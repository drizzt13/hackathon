package com.expedia.derbysoft.hackathon.webservice.util;

public abstract class RequestHelper {

    public static boolean isHotelSearchRQ(String v) {
        return v.contains("hotelsearch");
    }

}
