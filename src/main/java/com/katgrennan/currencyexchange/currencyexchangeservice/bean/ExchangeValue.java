package com.katgrennan.currencyexchange.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public ExchangeValue() {

    }

    public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }
}