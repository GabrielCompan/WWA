package com.store.store.repository;

import org.springframework.data.repository.CrudRepository;
import com.store.store.model.Egg;

public interface StoreRepository extends CrudRepository<Egg, Integer> {
}