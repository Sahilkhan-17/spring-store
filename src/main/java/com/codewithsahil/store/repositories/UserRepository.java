package com.codewithsahil.store.repositories;

import com.codewithsahil.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
