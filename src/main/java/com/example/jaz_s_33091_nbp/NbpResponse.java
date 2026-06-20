package com.example.jaz_s_33091_nbp;

import java.util.List;

public class NbpResponse {

    private String table;
    private String currency;
    private String code;
    private List<NbpRate> rates;

    public NbpResponse() {
    }

    public String getTable() {
        return table;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public List<NbpRate> getRates() {
        return rates;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setRates(List<NbpRate> rates) {
        this.rates = rates;
    }
}