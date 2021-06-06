package com.sda.alexandraorza.webshop.repository;

import com.sda.alexandraorza.webshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
