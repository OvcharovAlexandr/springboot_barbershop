package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import com.alexovch.springboot_barbershop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserBarbershop> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(UserBarbershop user) {
        userRepository.save(user);
    }

    @Override
    public UserBarbershop getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
