package com.expedia.derbysoft.hackathon.utils;

public abstract class Environments {

    private static final String APIKEY = "IbqTxDhLG0kWLbs27A2nkJfL2lXenG5j";
    public static final String HOTEL_SEARCH_URL = "http://terminal2.expedia.com/x/hotels?apikey=" + APIKEY;
    public static final String REVIEWS_URL = "http://terminal2.expedia.com/x/reviews/hotels?apikey=" + APIKEY;
    public static final boolean REVIEWS_RATING_REQUIRED = false;

    public static String getHotelSearchURL(String location, String radius, String dates) {
        return HOTEL_SEARCH_URL + "&location=" + location + "&radius=" + radius + "&dates=" + dates;
    }

    public static String getReviewsURL(String hotelId) {
        return REVIEWS_URL + "&items=2000&hotelId=" + hotelId;
    }

    public static boolean reviewsRatingRequired() {
        return REVIEWS_RATING_REQUIRED;
    }

}