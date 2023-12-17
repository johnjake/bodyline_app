package com.bodyline.org.repository;

import com.bodyline.org.model.Customer;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ReactiveSortingRepository<Customer, Integer> {

}