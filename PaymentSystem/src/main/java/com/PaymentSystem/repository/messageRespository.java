package com.PaymentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.message;

public interface messageRespository extends JpaRepository< message, String>{

}
