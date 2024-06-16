package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceBarbershop, Integer> {
}
