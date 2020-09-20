package com.katgrennan.currencyexchange.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepo extends JpaRepository<ExchangeValue, Long> {
    // Query database for a specific ExchangeValue
    ExchangeValue findByFromAndTo(String from, String to);
}
