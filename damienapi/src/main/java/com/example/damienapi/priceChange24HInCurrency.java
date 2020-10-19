package com.example.damienapi;

import org.apache.commons.math3.util.Precision;

public class priceChange24HInCurrency {
    private float usd;
    private float aud;
    private float jpy;
    private float btc;

    public priceChange24HInCurrency(float usd, float aud, float jpy, float btc) {
        this.usd = usd;
        this.aud = aud;
        this.jpy=jpy;
        this.btc=btc;

    }

    public void setJpy(float jpy) {
        this.jpy = jpy;
    }

    public void setBtc(float btc) {
        this.btc = btc;
    }

    public void setUsd(float usd) {
        this.usd = usd;
    }

    public void setAud(float aud) {
        this.aud = aud;
    }

    public float getJpy() {
        return Precision.round(jpy,3);
    }

    public float getBtc() {
        return Precision.round(btc,3);
    }

    public float getUsd() {
        return Precision.round(usd,3);
    }

    public float getAud() {
        return Precision.round(aud,3);
    }
}

