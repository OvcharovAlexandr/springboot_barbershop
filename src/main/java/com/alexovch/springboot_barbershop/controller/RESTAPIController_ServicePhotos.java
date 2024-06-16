package com.alexovch.springboot_barbershop.controller;


import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;
import com.alexovch.springboot_barbershop.entity.ServicePhoto;
import com.alexovch.springboot_barbershop.service.ServicePhotoService;
import com.alexovch.springboot_barbershop.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service_gallery")
public class RESTAPIController_ServicePhotos {

    private final ServicePhotoService servicePhotoService;
    private final ServiceService serviceService;

    @Autowired
    public RESTAPIController_ServicePhotos(ServicePhotoService servicePhotoService, ServiceService serviceService) {
        this.servicePhotoService = servicePhotoService;
        this.serviceService = serviceService;
    }


    @GetMapping("")
    public List<ServicePhoto> getServices() {
        return servicePhotoService.getAllServicePhotos();
    }

    @GetMapping("/{id}")
    public ServicePhoto getService(@PathVariable int id) {
        return servicePhotoService.getServicePhoto(id);
    }

    @PostMapping("")
    public ServicePhoto createService(@RequestBody ServicePhotoRequest servicePhotoRequest) {

        ServicePhoto servicePhoto = servicePhotoRequest.getServicePhoto();
        ServiceBarbershop service = serviceService.getService(servicePhotoRequest.getServiceId());

        if (service != null) {
            servicePhoto.setService(service);
            servicePhotoService.saveServicePhoto(servicePhoto);
            return servicePhoto;
        }else {
            return null;
        }
    }

    @PutMapping("")
    public ServicePhoto updateService(@RequestBody ServicePhoto servicePhoto) {
        servicePhotoService.saveServicePhoto(servicePhoto);
        return servicePhoto;
    }

    @DeleteMapping("/{id}")
    public String deleteService(@PathVariable int id) {
        servicePhotoService.deleteServicePhoto(id);
        return "Service photo with id " + id + " was deleted";
    }

}

