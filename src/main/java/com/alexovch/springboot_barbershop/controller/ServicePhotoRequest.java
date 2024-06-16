package com.alexovch.springboot_barbershop.controller;

import com.alexovch.springboot_barbershop.entity.ServicePhoto;

public class ServicePhotoRequest {
    private int serviceId;
    private ServicePhoto servicePhoto;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public ServicePhoto getServicePhoto() {
        return servicePhoto;
    }

    public void setServicePhoto(ServicePhoto servicePhoto) {
        this.servicePhoto = servicePhoto;
    }
}
