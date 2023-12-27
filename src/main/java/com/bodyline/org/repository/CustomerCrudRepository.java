package com.bodyline.org.repository;

import com.bodyline.org.model.Customer;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface CustomerCrudRepository extends ReactiveCrudRepository<Customer, Integer> {
    Mono<Customer> findByCustomerId(String customerId);
}
