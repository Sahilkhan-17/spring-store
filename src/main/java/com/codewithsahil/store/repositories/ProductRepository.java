package com.codewithsahil.store.repositories;

import com.codewithsahil.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
