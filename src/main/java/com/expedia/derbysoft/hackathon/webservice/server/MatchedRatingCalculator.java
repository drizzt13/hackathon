package com.expedia.derbysoft.hackathon.webservice.server;

import com.expedia.derbysoft.hackathon.utils.BigDecimals;

import java.math.BigDecimal;

/**
 * Created by zhupan on 12/7/15.
 */
public class MatchedRatingCalculator {

    public static BigDecimal calculate(BigDecimal distance, BigDecimal guestRating) {
        BigDecimal ratting = calculateRatting(distance, guestRating);
        if (ratting.doubleValue() > 5) {
            return new BigDecimal("5");
        }
        if (ratting.doubleValue() < 0) {
            return BigDecimal.ZERO;
        }
        return BigDecimals.roundUp(ratting);
    }

    public static BigDecimal calculateRatting(BigDecimal distance, BigDecimal guestRating) {
        if (distance.doubleValue() < 0.5) {
            return guestRating.add(BigDecimal.valueOf(0.5));
        }
        if (distance.doubleValue() < 1) {
            return guestRating.add(BigDecimal.valueOf(0.4));
        }
        if (distance.doubleValue() < 1.5) {
            return guestRating.add(BigDecimal.valueOf(0.3));
        }
        if (distance.doubleValue() < 2) {
            return guestRating.add(BigDecimal.valueOf(0.2));
        }
        if (distance.doubleValue() < 2.5) {
            return guestRating.add(BigDecimal.valueOf(0.1));
        }
        if (distance.doubleValue() < 3) {
            return guestRating.add(BigDecimal.valueOf(0.05));
        }
        if (distance.doubleValue() < 4) {
            return guestRating;
        }
        if (distance.doubleValue() < 5) {
            return guestRating.add(BigDecimal.valueOf(-0.2));
        }
        if (distance.doubleValue() < 10) {
            return guestRating.add(BigDecimal.valueOf(-0.5));
        }
        if (distance.doubleValue() < 20) {
            return guestRating.add(BigDecimal.valueOf(-1));
        }
        return guestRating.add(BigDecimal.valueOf(-2));
    }

}
