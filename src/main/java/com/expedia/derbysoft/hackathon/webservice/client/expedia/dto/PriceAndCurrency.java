package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

import java.math.BigDecimal;

/**
 * Created by zhupan on 12/7/15.
 */
public class PriceAndCurrency {

    private BigDecimal value;

    private String currency;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
