package com.expedia.derbysoft.hackathon.utils.latlng;

import java.math.BigDecimal;


/**
 * Created by zhupan on 12/7/15.
 */
public abstract class LatLngs {

    public static double distance(LatLng latLng1, LatLng latLng2) {
        return distance(latLng1.getLat(), latLng1.getLng(), latLng2.getLat(), latLng2.getLng());
    }

    public static double distance(BigDecimal lat1, BigDecimal lng1, BigDecimal lat2, BigDecimal lng2) {
        return distance(lat1.doubleValue(), lng1.doubleValue(), lat2.doubleValue(), lng2.doubleValue());
    }

    // return m
    public static double distance(double lat1, double lng1, double lat2, double lng2) {
        return new LatLng(lat1, lng1).distanceTo(new LatLng(lat2, lng2));
    }

    public static int azimuth(LatLng latLng1, LatLng latLng2) {
        return azimuth(latLng1.getLat(), latLng1.getLng(), latLng2.getLat(), latLng2.getLng());
    }

    public static int azimuth(BigDecimal lat1, BigDecimal lng1, BigDecimal lat2, BigDecimal lng2) {
        return azimuth(lat1.doubleValue(), lng1.doubleValue(), lat2.doubleValue(), lng2.doubleValue());
    }

    public static int azimuth(double lat1, double lng1, double lat2, double lng2) {
        return new LatLng(lat1, lng1).bearingTo(new LatLng(lat2, lng2));
    }

}
