package com.PaymentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.bank;


public interface bankRespository extends JpaRepository<bank, String>  {

}
