package com.alexovch.springboot_barbershop.controller;

import com.alexovch.springboot_barbershop.entity.ServicePhoto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicePhotoRequest {
    private int serviceId;
    private ServicePhoto servicePhoto;
}
