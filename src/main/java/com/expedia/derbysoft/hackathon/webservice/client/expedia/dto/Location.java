package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import com.expedia.derbysoft.hackathon.webservice.dto.GeoLocation;

/**
 * Created by zhupan on 12/7/15.
 */
public class Location {

    private String streetAddress;

    private String city;

    private String province;

    private String country;

    private GeoLocation geoLocation;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }
}
