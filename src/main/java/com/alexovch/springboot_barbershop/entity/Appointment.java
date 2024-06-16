package com.alexovch.springboot_barbershop.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "schedule")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "user_id")
    private UserBarbershop user;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "service_id")
    private ServiceBarbershop service;
    @Column(name = "event_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date eventDate;
    @Column(name = "details")
    private String details;

    public Appointment() {
    }

    public Appointment(UserBarbershop user, ServiceBarbershop service, Date eventDate, String details) {
        this.user = user;
        this.service = service;
        this.eventDate = eventDate;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", user=" + user +
                ", service=" + service +
                ", eventDate=" + eventDate +
                ", details='" + details + '\'' +
                '}';
    }

    public UserBarbershop getUser() {
        return user;
    }

    public void setUser(UserBarbershop user) {
        this.user = user;
    }

    public ServiceBarbershop getService() {
        return service;
    }

    public void setService(ServiceBarbershop service) {
        this.service = service;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

