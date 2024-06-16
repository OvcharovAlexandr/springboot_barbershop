package com.alexovch.springboot_barbershop.controller;

import com.alexovch.springboot_barbershop.entity.CustomersFeedback;

public class CustomersFeedbackRequest {
    private int serviceId;
    private int customerId;
    private CustomersFeedback customersFeedback;

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

    public CustomersFeedback getCustomersFeedback() {
        return customersFeedback;
    }

    public void setCustomersFeedback(CustomersFeedback customersFeedback) {
        this.customersFeedback = customersFeedback;
    }
}
