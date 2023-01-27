package com.store.store.service;

import com.store.store.repository.StoreRepository;
import com.store.store.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public void saveEggs(int id, String name, double price, int hatchingTime) {
        Store e = new Store();
        e.setName(name);
        e.setPrice(price);
        e.setHatchingTime(hatchingTime);
        storeRepository.save(e);
    }
    public Iterable<Store> getAllEggs() {
        return storeRepository.findAll();
    }
};