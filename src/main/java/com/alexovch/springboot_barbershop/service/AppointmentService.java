package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.Appointment;

import java.util.List;

public interface AppointmentService {
    public List<Appointment> getAllAppointments();

    public void saveAppointment(Appointment appointment);

    public Appointment getAppointment(int id);

    public void deleteAppointment(int id);
}
