package com.PaymentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.currency;

public interface  currencyRespository extends JpaRepository< currency, String> {

}
