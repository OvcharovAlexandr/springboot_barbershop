package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.ServicePhoto;
import com.alexovch.springboot_barbershop.repository.ServicePhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePhotoServiceImpl implements ServicePhotoService {

    private final ServicePhotoRepository servicePhotoRepository;

    @Autowired
    public ServicePhotoServiceImpl(ServicePhotoRepository servicePhotoRepository) {
        this.servicePhotoRepository = servicePhotoRepository;
    }

    @Override
    public List<ServicePhoto> getAllServicePhotos() {
        return servicePhotoRepository.findAll();
    }

    @Override
    public void saveServicePhoto(ServicePhoto servicePhoto) {
        servicePhotoRepository.save(servicePhoto);
    }

    @Override
    public ServicePhoto getServicePhoto(int id) {
        return servicePhotoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteServicePhoto(int id) {
        servicePhotoRepository.deleteById(id);
    }
}
