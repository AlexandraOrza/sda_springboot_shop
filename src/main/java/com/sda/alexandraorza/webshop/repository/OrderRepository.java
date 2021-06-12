package com.sda.alexandraorza.webshop.repository;

import com.sda.alexandraorza.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
