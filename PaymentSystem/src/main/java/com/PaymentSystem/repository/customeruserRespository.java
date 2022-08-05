package com.PaymentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.customeruser;

public interface customeruserRespository extends JpaRepository< customeruser, String> {

}
