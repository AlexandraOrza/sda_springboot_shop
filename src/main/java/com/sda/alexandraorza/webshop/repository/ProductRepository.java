package com.sda.alexandraorza.webshop.repository;

import com.sda.alexandraorza.webshop.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
