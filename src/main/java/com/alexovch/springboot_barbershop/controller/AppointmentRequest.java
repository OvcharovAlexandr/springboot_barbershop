package com.alexovch.springboot_barbershop.controller;

import com.alexovch.springboot_barbershop.entity.Appointment;

public class AppointmentRequest {
    private int serviceId;
    private int customerId;
    private Appointment appointment;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}
