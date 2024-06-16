package com.alexovch.springboot_barbershop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "services_gallery")
public class ServicePhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "service_id")
    private ServiceBarbershop service;
    @Column(name = "img_url")
    private String imgURL;

    public ServicePhoto() {
    }

    public ServicePhoto(ServiceBarbershop service, String imgURL) {
        this.service = service;
        this.imgURL = imgURL;
    }

    public int getId() {
        return id;
    }

    public ServiceBarbershop getService() {
        return service;
    }

    public void setService(ServiceBarbershop service) {
        this.service = service;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
