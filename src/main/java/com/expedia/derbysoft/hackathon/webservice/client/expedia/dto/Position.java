package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import java.math.BigDecimal;

public class Position {

    private String type;

    private BigDecimal[] coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(BigDecimal[] coordinates) {
        this.coordinates = coordinates;
    }
}
