package com.PaymentSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.customer ;

public interface customerRespository extends JpaRepository< customer, String> {

}
