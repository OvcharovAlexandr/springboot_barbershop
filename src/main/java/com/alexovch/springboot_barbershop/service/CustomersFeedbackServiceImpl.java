package com.alexovch.springboot_barbershop.service;

import com.alexovch.springboot_barbershop.entity.CustomersFeedback;
import com.alexovch.springboot_barbershop.repository.CustomersFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersFeedbackServiceImpl implements CustomersFeedbackService {

    private final CustomersFeedbackRepository customersFeedbackRepository;

    @Autowired
    public CustomersFeedbackServiceImpl(CustomersFeedbackRepository customersFeedbackRepository) {
        this.customersFeedbackRepository = customersFeedbackRepository;
    }

    @Override
    public List<CustomersFeedback> getAllCustomersFeedbacks() {
        return customersFeedbackRepository.findAll();
    }

    @Override
    public void saveCustomersFeedback(CustomersFeedback customersFeedback) {
        customersFeedbackRepository.save(customersFeedback);
    }

    @Override
    public CustomersFeedback getCustomersFeedback(int id) {
        return customersFeedbackRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCustomersFeedback(int id) {
        customersFeedbackRepository.deleteById(id);
    }
}
