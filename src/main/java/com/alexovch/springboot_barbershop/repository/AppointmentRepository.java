package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
