package com.PaymentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.transaction;

public interface transactionRespository extends JpaRepository< transaction, Double> {

}
