package com.expedia.derbysoft.hackathon.dto;

import java.math.BigDecimal;

/**
 * Created by zhupan on 12/8/15.
 */
public class HotelDTO {

    private String HotelID;

    private String HotelName;

    private GeoLocation location;

    private BigDecimal baseRate;

    private String detailsUrl;

    private String thumbnailUrl;

    private BigDecimal matchedRating;

    private BigDecimal distance;

}
