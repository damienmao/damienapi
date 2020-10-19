package com.example.damienapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service  //what does it do?
public class PriceInfoService {
    @Autowired
    private CoingeckoClient coingeckoClient;

    public ResponseEntity<?> getPriceInfo(String id){
        return coingeckoClient.getInfoCoingecko(id);
    }
    public ResponseEntity<?> getLastWeekPriceInfo(String id){
        return coingeckoClient.getLastWeekInfoCoingecko(id);
    }

    public ResponseEntity<?> getMarketInfo(String currency,String id){
        return coingeckoClient.getMarketInfo(currency,id);
    }
}

