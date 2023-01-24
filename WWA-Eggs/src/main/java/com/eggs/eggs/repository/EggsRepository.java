package com.eggs.eggs.repository;
import org.springframework.data.repository.CrudRepository;
import com.eggs.eggs.model.Eggs;

public interface EggsRepository extends CrudRepository<Eggs, Integer> {

}

