package com.example.damienapi.Model.FirstApi.CryptoInfo;

public class CryptoPricesOutput {
    private String id;
    private String name;
    private String symbol;
    private String last_updated;
    private String genesis_date;
    private Market_data market_data;


    public Market_data getMarket_data() {
        return market_data;
    }

    public void setMarket_data(Market_data market_data) {
        this.market_data = market_data;
    }


    public String getGenesis_date() {
        return genesis_date;
    }

    public void setGenesis_date(String genesis_date) {
        this.genesis_date = genesis_date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public CryptoPricesOutput(CryptoPricesOutputBuilder cryptoPricesOutputBuilder){
        id= cryptoPricesOutputBuilder.id;
        name= cryptoPricesOutputBuilder.name;
        symbol= cryptoPricesOutputBuilder.symbol;
        last_updated= cryptoPricesOutputBuilder.last_updated;
        market_data= cryptoPricesOutputBuilder.market_data;
        genesis_date= cryptoPricesOutputBuilder.genesis_date;
    }

    public CryptoPricesOutput() {
    }
}

