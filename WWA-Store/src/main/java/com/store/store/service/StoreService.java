package com.store.store.service;

import com.store.store.repository.StoreRepository;
import com.store.store.model.Egg;
import com.store.store.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Iterable<Egg> getAllEggs(int idEgg) {
        return storeRepository.findAll();
    }

    public void addEgg(int idEgg) {
        Egg egg= new Egg(idEgg);
        storeRepository.save(egg);
    }
}