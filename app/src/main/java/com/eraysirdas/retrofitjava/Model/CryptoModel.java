package com.eraysirdas.retrofitjava.Model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    public String currency;
    @SerializedName("price")
    public String price;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
