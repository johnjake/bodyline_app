package com.bodyline.org.service;

import com.bodyline.org.model.Customer;
import com.bodyline.org.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Flux<Customer> getAllCustomers(int page, int size, Sort sort) {
        return customerRepository.findAll(sort)
                .skip((long) page * size)
                .take(size);
    }
}
