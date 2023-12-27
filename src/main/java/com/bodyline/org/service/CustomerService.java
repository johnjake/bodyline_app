package com.bodyline.org.service;

import com.bodyline.org.model.Customer;
import com.bodyline.org.repository.CustomerCrudRepository;
import com.bodyline.org.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CustomerService {
    @Autowired
    private final CustomerRepository customerRepository;

    @Autowired
    private final CustomerCrudRepository customerCrudRepository;

    public CustomerService(CustomerRepository customerRepository, CustomerCrudRepository customerCrudRepository) {
        this.customerRepository = customerRepository;
        this.customerCrudRepository = customerCrudRepository;
    }

    public Flux<Customer> getAllCustomers(int page, int size, Sort sort) {
        return customerRepository.findAll(sort)
                .skip((long) page * size)
                .take(size);
    }

    public Mono<Customer> addCustomer(Customer customer) {
        return customerCrudRepository.save(customer);
    }

    public Mono<Customer> findCustomerByCustomerId(String customerId) {
        return customerCrudRepository.findByCustomerId(customerId);
    }

}
