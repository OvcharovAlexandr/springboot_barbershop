package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserBarbershop, Integer> {
}
