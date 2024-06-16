package com.alexovch.springboot_barbershop.controller;


import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;
import com.alexovch.springboot_barbershop.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class RESTAPIController_Services {

    private final ServiceService serviceService;

    @Autowired
    public RESTAPIController_Services(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @GetMapping("")
    public List<ServiceBarbershop> getServices() {
        return serviceService.getAllServices();
    }

    @GetMapping("/{id}")
    public ServiceBarbershop getService(@PathVariable int id) {
        return serviceService.getService(id);
    }

    @PostMapping("")
    public ServiceBarbershop createService(@RequestBody ServiceBarbershop service) {
        serviceService.saveService(service);
        return service;
    }

    @PutMapping("")
    public ServiceBarbershop updateService(@RequestBody ServiceBarbershop service) {
        serviceService.saveService(service);
        return service;
    }

    @DeleteMapping("/{id}")
    public String deleteService(@PathVariable int id) {
        serviceService.deleteService(id);
        return "Service with id " + id + " was deleted";
    }
}
