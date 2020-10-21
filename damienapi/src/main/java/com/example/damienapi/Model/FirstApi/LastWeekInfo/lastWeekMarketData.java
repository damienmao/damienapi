package com.example.damienapi.Model.FirstApi.LastWeekInfo;


import com.example.damienapi.Model.FirstApi.CryptoInfo.currentPrice;

public class lastWeekMarketData {
    private currentPrice current_price;

    public currentPrice getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(currentPrice current_price) {
        this.current_price = current_price;
    }
}
