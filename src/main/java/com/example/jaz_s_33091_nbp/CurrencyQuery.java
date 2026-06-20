package com.example.jaz_s_33091_nbp;

import jakarta.persistence.*;

@Entity
public class CurrencyQuery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String currency;
    private String startDate;
    private String endDate;
    private double calculatedRate;
    private String requestDateTime;

    public CurrencyQuery() {
    }

    public int getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getCalculatedRate() {
        return calculatedRate;
    }

    public String getRequestDateTime() {
        return requestDateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setCalculatedRate(double calculatedRate) {
        this.calculatedRate = calculatedRate;
    }

    public void setRequestDateTime(String requestDateTime) {
        this.requestDateTime = requestDateTime;
    }
}