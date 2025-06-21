package com.codewithsahil.store.repositories;

import com.codewithsahil.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
