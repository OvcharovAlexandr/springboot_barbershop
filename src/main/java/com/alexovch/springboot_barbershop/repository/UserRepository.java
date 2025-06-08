package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserBarbershop, Integer> {
    public UserBarbershop findByName(String name); //using service
    Optional<UserBarbershop> findByEmail(String email);//automatically from JPA
}
