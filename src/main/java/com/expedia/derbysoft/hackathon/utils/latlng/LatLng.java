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

    public int bearingTo(LatLng dest) {
        int azimuth = (int) Math.round(computeBearing(lat, lng, dest.getLat(), dest.getLng()));
        if (azimuth < 0) {
            azimuth += 360;
        }
        return azimuth;
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

    private static double computeBearing(BigDecimal lat1, BigDecimal lng1, BigDecimal lat2, BigDecimal lng2) {
        if (lat1 == null || lng1 == null || lat2 == null || lng2 == null) {
            return -99999;
        }
        return computeBearing(lat1.doubleValue(), lng1.doubleValue(), lat2.doubleValue(), lng2.doubleValue());
    }

    private static double computeBearing(double lat1, double lng1, double lat2, double lng2) {
        if (!validateLngLat(new LatLng(lat1, lng1)) || !validateLngLat(new LatLng(lat2, lng2))) {
            return -99999;
        }
        lat1 *= Math.PI / 180.0;
        lat2 *= Math.PI / 180.0;
        lng1 *= Math.PI / 180.0;
        lng2 *= Math.PI / 180.0;
        double a = EARTH_RADIUS * 1000; // WGS84 major axis
        double b = 6356752.3142; // WGS84 semi-major axis
        double f = (a - b) / a;
        double L = lng2 - lng1;
        double U1 = Math.atan((1.0 - f) * Math.tan(lat1));
        double U2 = Math.atan((1.0 - f) * Math.tan(lat2));

        double cosU1 = Math.cos(U1);
        double cosU2 = Math.cos(U2);
        double sinU1 = Math.sin(U1);
        double sinU2 = Math.sin(U2);
        double cosU1cosU2 = cosU1 * cosU2;
        double sinU1sinU2 = sinU1 * sinU2;

        double sigma;
        double cosSqAlpha;
        double cos2SM;
        double cosSigma;
        double sinSigma;
        double cosLambda = 0.0;
        double sinLambda = 0.0;

        double lambda = L;
        int maxIters = 20;
        for (int iter = 0; iter < maxIters; iter++) {
            double lambdaOrig = lambda;
            cosLambda = Math.cos(lambda);
            sinLambda = Math.sin(lambda);
            double t1 = cosU2 * sinLambda;
            double t2 = cosU1 * sinU2 - sinU1 * cosU2 * cosLambda;
            double sinSqSigma = t1 * t1 + t2 * t2;
            sinSigma = Math.sqrt(sinSqSigma);
            cosSigma = sinU1sinU2 + cosU1cosU2 * cosLambda;
            sigma = Math.atan2(sinSigma, cosSigma);
            double sinAlpha = (sinSigma == 0) ? 0.0 : cosU1cosU2 * sinLambda / sinSigma;
            cosSqAlpha = 1.0 - sinAlpha * sinAlpha;
            cos2SM = (cosSqAlpha == 0) ? 0.0 : cosSigma - 2.0 * sinU1sinU2 / cosSqAlpha;
            double c = (f / 16.0) * cosSqAlpha * (4.0 + f * (4.0 - 3.0 * cosSqAlpha));
            lambda = L + (1.0 - c) * f * sinAlpha * (sigma + c * sinSigma * (cos2SM + c * cosSigma * (-1.0 + 2.0 * cos2SM * cos2SM)));
            double delta = (lambda - lambdaOrig) / lambda;
            if (Math.abs(delta) < 1.0e-12) {
                break;
            }
        }
        double initialBearing = Math.atan2(cosU2 * sinLambda, cosU1 * sinU2 - sinU1 * cosU2 * cosLambda);
        initialBearing *= 180.0 / Math.PI;
        return initialBearing;
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
