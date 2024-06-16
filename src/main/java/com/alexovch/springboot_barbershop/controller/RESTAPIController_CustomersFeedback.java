package com.alexovch.springboot_barbershop.controller;

import com.alexovch.springboot_barbershop.entity.CustomersFeedback;
import com.alexovch.springboot_barbershop.entity.ServiceBarbershop;
import com.alexovch.springboot_barbershop.entity.UserBarbershop;
import com.alexovch.springboot_barbershop.service.CustomersFeedbackService;
import com.alexovch.springboot_barbershop.service.ServiceService;
import com.alexovch.springboot_barbershop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedbacks")
public class RESTAPIController_CustomersFeedback {

    private final CustomersFeedbackService customersFeedbackService;
    private final ServiceService serviceService;
    private final UserService userService;

    @Autowired
    public RESTAPIController_CustomersFeedback(CustomersFeedbackService customersFeedbackService, ServiceService serviceService, UserService userService) {
        this.customersFeedbackService = customersFeedbackService;
        this.serviceService = serviceService;
        this.userService = userService;
    }

    @GetMapping("")
    public List<CustomersFeedback> getFeedbacks() {
        return customersFeedbackService.getAllCustomersFeedbacks();
    }

    @GetMapping("/{id}")
    public CustomersFeedback getFeedback(@PathVariable int id) {
        return customersFeedbackService.getCustomersFeedback(id);
    }

    @PostMapping("")
    public CustomersFeedback createFeedback(@RequestBody CustomersFeedbackRequest customersFeedbackRequest) {
        CustomersFeedback customersFeedback = customersFeedbackRequest.getCustomersFeedback();
        ServiceBarbershop service = serviceService.getService(customersFeedbackRequest.getServiceId());
        UserBarbershop customer = userService.getUser(customersFeedbackRequest.getCustomerId());

        if (service != null) {
            customersFeedback.setService(service);
            customersFeedback.setUser(customer);
            customersFeedbackService.saveCustomersFeedback(customersFeedback);
            return customersFeedback;
        } else {
            return null;
        }
    }

    @PutMapping("")
    public CustomersFeedback updateFeedback(@RequestBody CustomersFeedback customersFeedback) {
        customersFeedbackService.saveCustomersFeedback(customersFeedback);
        return customersFeedback;
    }

    @DeleteMapping("/{id}")
    public String deleteFeedback(@PathVariable int id) {
        customersFeedbackService.deleteCustomersFeedback(id);
        return "Feedback with id " + id + " was deleted";
    }
}
