package com.example.damienapi.Model.FirstApi.CryptoInfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Market_data {

    @JsonProperty ("price_change_24h_in_currency")
    private priceChange24HInCurrency priceChange24hInCurrency;

    @JsonProperty ("current_price")
    private com.example.damienapi.Model.FirstApi.CryptoInfo.currentPrice currentPrice;

    public priceChange24HInCurrency getPriceChange24hInCurrency() {
        return priceChange24hInCurrency;
    }

    public void setPriceChange24hInCurrency(priceChange24HInCurrency priceChange24hInCurrency) {
        this.priceChange24hInCurrency = priceChange24hInCurrency;
    }

    public currentPrice getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(currentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }
}
