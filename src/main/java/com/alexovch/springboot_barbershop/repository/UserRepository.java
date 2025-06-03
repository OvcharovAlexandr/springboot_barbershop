package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserBarbershop, Integer> {
    public UserBarbershop findByName(String name);
}
