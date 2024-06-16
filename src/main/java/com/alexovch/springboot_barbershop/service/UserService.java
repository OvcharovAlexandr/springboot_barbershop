package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.UserBarbershop;

import java.util.List;

public interface UserService {
    public List<UserBarbershop> getAllUsers();
    public void saveUser(UserBarbershop user);
    public UserBarbershop getUser(int id);
    public void deleteUser(int id);
}
