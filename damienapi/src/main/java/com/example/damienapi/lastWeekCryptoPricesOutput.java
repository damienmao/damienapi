package com.example.damienapi;

public class lastWeekCryptoPricesOutput {

    private lastWeekMarketData market_data;

    public lastWeekMarketData getMarket_data() {
        return market_data;
    }

    public void setMarket_data(lastWeekMarketData market_data) {
        this.market_data = market_data;
    }

    public lastWeekCryptoPricesOutput(lastweekCryptopricesoutputbuilder lastWeek_crytoPricesOutputBuilder){

        market_data=lastWeek_crytoPricesOutputBuilder.market_data;

    }

    public lastWeekCryptoPricesOutput() {
    }
}
