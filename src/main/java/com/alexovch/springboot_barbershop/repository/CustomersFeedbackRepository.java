package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.CustomersFeedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersFeedbackRepository extends JpaRepository<CustomersFeedback, Integer> {
}
