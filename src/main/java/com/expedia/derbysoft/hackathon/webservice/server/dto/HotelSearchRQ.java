package com.expedia.derbysoft.hackathon.webservice.server.dto;

import com.expedia.derbysoft.hackathon.hotel.GeoLocation;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelSearchRQ {

    private Map<String, String[]> parameterMap;

    private String location;

    private String radius;

    private String dates;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public Map<String, String[]> getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(Map<String, String[]> parameterMap) {
        this.parameterMap = parameterMap;
        this.setDates(getValue(parameterMap, "dates"));
        this.setLocation(getValue(parameterMap, "location"));
        this.setRadius(getValue(parameterMap, "radius"));
    }

    public GeoLocation getGeoLocation() {
        GeoLocation geoLocation = new GeoLocation();
        String[] latlon = location.split(",");
        geoLocation.setLatitude(new BigDecimal(latlon[0]));
        geoLocation.setLongitude(new BigDecimal(latlon[1]));
        return geoLocation;
    }

    private static String getValue(Map<String, String[]> parameterMap, String key) {
        String[] values = parameterMap.get("dates");
        if (values == null) {
            return null;
        }
        return values[0];
    }

}
