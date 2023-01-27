package com.store.store.repository;

import org.springframework.data.repository.CrudRepository;
import com.store.store.model.Store;

public interface StoreRepository extends CrudRepository<Store, Integer> {
}