package com.alexovch.springboot_barbershop.repository;

import com.alexovch.springboot_barbershop.entity.ServicePhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicePhotoRepository extends JpaRepository<ServicePhoto, Integer> {
}
