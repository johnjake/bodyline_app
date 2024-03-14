package com.bodyline.org.controller;

import com.bodyline.org.model.Customer;
import com.bodyline.org.model.GrossSalesService;
import com.bodyline.org.service.CustomerService;
import com.bodyline.org.service.GrossSalesServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//

@RestController
@RequestMapping("/api") // Base path for all methods in this controller
public class CustomerController {
    private final CustomerService customerService;
    private final GrossSalesServiceService grossSalesService;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    public CustomerController(CustomerService customerService, GrossSalesServiceService service) {
        this.customerService = customerService;
        this.grossSalesService = service;
    }

    @GetMapping("/customers")
    public Flux<Customer> getCustomers(@RequestParam(value = "page", defaultValue = "0") int page,
                                       @RequestParam(value = "size", defaultValue = "0") int size,
                                       @RequestParam(value = "sort", defaultValue = "Ctrl_ID") String sort) {
        return customerService.getAllCustomers(page, size, Sort.by(sort));
    }

    @PostMapping("/add")
    public Mono<Customer> addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }

    @GetMapping("/gross-sales-services")
    public Flux<GrossSalesService> getGrossSalesServices(
            @RequestParam String userName,
            @RequestParam String dateNow,
            @RequestParam String lastDate,
            @RequestParam int page,
            @RequestParam int pageSize
            ) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDateNow = dateFormat.parse(dateNow);
            Date parsedLastDate = dateFormat.parse(lastDate);
            return grossSalesService.getGrossSalesServicesByTherapist(userName, dateNow, lastDate, page, pageSize);
        } catch (ParseException e) {
            // Handle parsing exception here
            e.printStackTrace(); // This is for demonstration; handle the exception appropriately
            return null;
        }
    }
}