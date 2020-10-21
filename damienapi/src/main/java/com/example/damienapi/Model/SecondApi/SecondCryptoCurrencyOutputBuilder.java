package com.example.damienapi.Model.SecondApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SecondCryptoCurrencyOutputBuilder {
    public String id;

    @JsonProperty("current_price")
    public float currentPrice;

    @JsonProperty("market_cap")
    public long marketCap;

    public SecondCryptoCurrencyOutputBuilder Id(String id) {
        this.id = id;
        return this;
    }

    public SecondCryptoCurrencyOutputBuilder Current_price(float currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public SecondCryptoCurrencyOutputBuilder Market_cap(long marketCap) {
        this.marketCap = marketCap;
        return this;
    }

    public SecondCryptoCurrencyOutput build(){
        return new SecondCryptoCurrencyOutput(this);
    }
}
