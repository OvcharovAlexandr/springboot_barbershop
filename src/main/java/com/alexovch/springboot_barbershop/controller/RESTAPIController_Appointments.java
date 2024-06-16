package com.alexovch.springboot_barbershop.controller;


import com.alexovch.springboot_barbershop.entity.Appointment;
import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;
import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import com.alexovch.springboot_barbershop.service.AppointmentService;
import com.alexovch.springboot_barbershop.service.ServiceService;
import com.alexovch.springboot_barbershop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class RESTAPIController_Appointments {

    private final AppointmentService appointmentService;
    private final ServiceService serviceService;
    private final UserService userService;

    @Autowired
    public RESTAPIController_Appointments(AppointmentService appointmentService, ServiceService serviceService, UserService userService) {
        this.appointmentService = appointmentService;
        this.serviceService = serviceService;
        this.userService = userService;
    }

    @GetMapping("")
    public List<Appointment> getAppointments() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable int id) {
        return appointmentService.getAppointment(id);
    }

    @PostMapping("")
    public Appointment createAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        Appointment appointment = appointmentRequest.getAppointment();
        ServiceBarbershop service = serviceService.getService(appointmentRequest.getServiceId());
        UserBarbershop customer = userService.getUser(appointmentRequest.getCustomerId());

        if (service != null) {
            appointment.setService(service);
            appointment.setUser(customer);
            appointmentService.saveAppointment(appointment);
            return appointment;
        } else {
            return null;
        }
    }

    @PutMapping("")
    public Appointment updateAppointment(@RequestBody Appointment appointment) {
        appointmentService.saveAppointment(appointment);
        return appointment;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        appointmentService.deleteAppointment(id);
        return "Appointment with id " + id + " was deleted";
    }
}
