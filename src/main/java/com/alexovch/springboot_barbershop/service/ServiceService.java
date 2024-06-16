package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;

import java.util.List;

public interface ServiceService {
    public List<ServiceBarbershop> getAllServices();

    public void saveService(ServiceBarbershop service);

    public ServiceBarbershop getService(int id);

    public void deleteService(int id);
}
