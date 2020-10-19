package com.example.damienapi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WebAPIController {

    @Autowired
    private PriceInfoService priceInfoService;

    //retrieve one currency
    @GetMapping(value="/coins/{id}")
    public ResponseEntity<?> retrievePricesByID(@PathVariable String id){
        List<Object> JsonArray=new ArrayList<>();
        JsonArray.add(priceInfoService.getPriceInfo(id).getBody());
        JsonArray.add(priceInfoService.getLastWeekPriceInfo(id).getBody());
        return ResponseEntity.ok(JsonArray);
    }

    @GetMapping(value="/markets")
    public ResponseEntity<?> getMarketInfo(@RequestParam("currency") String currency,@RequestParam("id") String id){

        return ResponseEntity.ok(priceInfoService.getMarketInfo(currency,id).getBody());
    }



}

