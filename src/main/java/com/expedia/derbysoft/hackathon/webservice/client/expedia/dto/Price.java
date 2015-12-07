package com.expedia.derbysoft.hackathon.webservice.client.expedia.dto;

/**
 * Created by zhupan on 12/7/15.
 */
public class Price {

    private PriceAndCurrency baseRate;
    private PriceAndCurrency taxRcAndFees;
    private PriceAndCurrency totalRate;

    public PriceAndCurrency getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(PriceAndCurrency baseRate) {
        this.baseRate = baseRate;
    }

    public PriceAndCurrency getTaxRcAndFees() {
        return taxRcAndFees;
    }

    public void setTaxRcAndFees(PriceAndCurrency taxRcAndFees) {
        this.taxRcAndFees = taxRcAndFees;
    }

    public PriceAndCurrency getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(PriceAndCurrency totalRate) {
        this.totalRate = totalRate;
    }
}


