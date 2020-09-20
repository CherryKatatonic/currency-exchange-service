package com.katgrennan.currencyexchange.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class CurrencyExchangeController {

    // Get server.port from environment to tell other services
    // which instance of this service they're talking to
    @Autowired
    private Environment env;

    @Autowired
    private ExchangeValueRepo repo;

    // GET endpoint for 1-to-1 currency exchange info
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = repo.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(Objects.requireNonNull(env.getProperty("server.port"))));
        return exchangeValue;
    }

}
