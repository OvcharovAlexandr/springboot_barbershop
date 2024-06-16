package com.alexovch.springboot_barbershop.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "customers_feedback")
public class CustomersFeedback {
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
    @Column(name = "commentary")
    private String commentary;

    public CustomersFeedback() {
    }

    public CustomersFeedback(UserBarbershop user, ServiceBarbershop service, Date eventDate, String commentary) {
        this.user = user;
        this.service = service;
        this.eventDate = eventDate;
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "CustomersFeedback{" +
                "id=" + id +
                ", user=" + user +
                ", service=" + service +
                ", eventDate=" + eventDate +
                ", commentary='" + commentary + '\'' +
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

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
