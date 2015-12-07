package com.expedia.derbysoft.hackathon.utils;

import java.math.BigDecimal;

public class DistanceHelper {

    private static final int KM = 1000;

    public static BigDecimal getDistance(BigDecimal distance) {
        return distance.divide(BigDecimal.valueOf(KM));
    }
}
