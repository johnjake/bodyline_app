package com.bodyline.org.controller;

import com.bodyline.org.model.Customer;
import com.bodyline.org.service.CustomerService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
//

@RestController
@RequestMapping("/api/") // Base path for all methods in this controller
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customers")
    public Flux<Customer> getCustomers(@RequestParam(value = "page", defaultValue = "0") int page,
                                       @RequestParam(value = "size", defaultValue = "10") int size,
                                       @RequestParam(value = "sort", defaultValue = "Ctrl_ID") String sort) {
        return customerService.getAllCustomers(page, size, Sort.by(sort));
    }
}