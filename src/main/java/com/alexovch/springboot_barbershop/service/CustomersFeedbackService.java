package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.CustomersFeedback;

import java.util.List;

public interface CustomersFeedbackService {
    public List<CustomersFeedback> getAllCustomersFeedbacks();

    public void saveCustomersFeedback(CustomersFeedback customersFeedback);

    public CustomersFeedback getCustomersFeedback(int id);

    public void deleteCustomersFeedback(int id);
}
