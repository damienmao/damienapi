package com.example.damienapi;

public class lastweekCryptopricesoutputbuilder {

    public lastWeekMarketData market_data;

    public lastweekCryptopricesoutputbuilder market_data(lastWeekMarketData market_data) {
        this.market_data=market_data;
        return this;
    }
    public lastWeekCryptoPricesOutput build(){
        return new lastWeekCryptoPricesOutput(this);
    }
}
