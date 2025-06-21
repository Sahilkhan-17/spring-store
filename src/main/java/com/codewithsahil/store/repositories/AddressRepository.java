package com.codewithsahil.store.repositories;

import com.codewithsahil.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository <Address, Long> {
}
