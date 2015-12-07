package com.expedia.derbysoft.hackathon.hotel;

import java.math.BigDecimal;

public class GeoLocation {

    private static final int DEFAULT_SCALE = 8;

    private static final int DEFAULT_PRECISION = 11;

    private BigDecimal latitude;

    private BigDecimal longitude;

    public GeoLocation() {
    }

    public GeoLocation(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }
}
