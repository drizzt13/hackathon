package com.expedia.derbysoft.hackathon.utils.latlng;

import java.math.BigDecimal;

/**
 * Created by zhupan on 12/7/15.
 */
public class LatLng {

    private static final double EARTH_RADIUS = 6378.137d;

    private static final double DOUBLE = 180.0d;

    private BigDecimal lat;

    private BigDecimal lng;

    public LatLng(BigDecimal lat, BigDecimal lng) {
        this.lng = lng;
        this.lat = lat;
    }

    public LatLng(double lat, double lng) {
        this(BigDecimal.valueOf(lat), BigDecimal.valueOf(lng));
    }

    public double distanceTo(LatLng dest) {
        return computeDistance(this.getLat(), this.getLng(), dest.getLat(), dest.getLng());
    }

    private static double computeDistance(BigDecimal lat1, BigDecimal lng1, BigDecimal lat2, BigDecimal lng2) {
        if (lat1 == null || lng1 == null || lat2 == null || lng2 == null) {
            return -1;
        }
        return computeDistance(lat1.doubleValue(), lng1.doubleValue(), lat2.doubleValue(), lng2.doubleValue());
    }

    // return m
    public static double computeDistance(double lat1, double lng1, double lat2, double lng2) {
        if (!validateLngLat(new LatLng(lat1, lng1)) || !validateLngLat(new LatLng(lat2, lng2))) {
            return -1;
        }
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lng1) - rad(lng2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        return s * EARTH_RADIUS * 1000;
    }

    private static boolean validateLngLat(LatLng latLng) {
        return latLng.getLng().abs().compareTo(new BigDecimal("180")) <= 0 && latLng.getLat().abs().compareTo(new BigDecimal("90")) <= 0;
    }

    private static double rad(double d) {
        return d * Math.PI / DOUBLE;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }
}
