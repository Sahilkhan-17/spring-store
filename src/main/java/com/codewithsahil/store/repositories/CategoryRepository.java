package com.codewithsahil.store.repositories;

import com.codewithsahil.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
