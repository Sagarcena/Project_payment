package com.PaymentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PaymentSystem.domain.employee;

public interface  employeeRespository extends JpaRepository< employee, Long>{

}
