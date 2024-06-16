package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.ServicePhoto;

import java.util.List;

public interface ServicePhotoService {
    public List<ServicePhoto> getAllServicePhotos();

    public void saveServicePhoto(ServicePhoto service);

    public ServicePhoto getServicePhoto(int id);

    public void deleteServicePhoto(int id);
}
