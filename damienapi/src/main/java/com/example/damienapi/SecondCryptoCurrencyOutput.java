package com.example.damienapi;

public class SecondCryptoCurrencyOutput  {
    private String id;
    private Float current_price;
    private Long market_cap;


    public String getId() {
        return id;
    }

    public Float getCurrent_price() {
        return current_price;
    }

    public Long getMarket_cap() {
        return market_cap;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrent_price(Float current_price) {
        this.current_price = current_price;
    }

    public void setMarket_cap(Long market_cap) {
        this.market_cap = market_cap;
    }

    public SecondCryptoCurrencyOutput (SecondCryptoCurrencyOutputBuilder secondCryptoCurrencyOutputBuilder){
        id=secondCryptoCurrencyOutputBuilder.id;
        current_price= secondCryptoCurrencyOutputBuilder.currentPrice;
        market_cap= secondCryptoCurrencyOutputBuilder.marketCap;
    }



    public SecondCryptoCurrencyOutput(){
    }
}
