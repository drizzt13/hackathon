package com.expedia.derbysoft.hackathon.webservice.server;

public abstract class RequestHelper {

    public static boolean isHotelSearchRQ(String v) {
        return v.contains("hotelsearch");
    }

}
