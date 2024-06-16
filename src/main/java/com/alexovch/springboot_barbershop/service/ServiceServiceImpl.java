package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;
import com.alexovch.springboot_barbershop.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @Override
    public List<ServiceBarbershop> getAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public void saveService(ServiceBarbershop service) {
        serviceRepository.save(service);
    }

    @Override
    public ServiceBarbershop getService(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteService(int id) {
        serviceRepository.deleteById(id);
    }
}
