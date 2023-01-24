package com.eggs.eggs.service;

import com.eggs.eggs.repository.EggsRepository;
import com.eggs.eggs.model.Eggs;
import com.eggs.eggs.repository.EggsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EggsService {
    @Autowired
    private EggsRepository eggsRepository;

    public void saveEggs(int id, String name, double price, int hatchingTime) {
        Eggs e = new Eggs();
        e.setName(name);
        e.setPrice(price);
        e.setHatchingTime(hatchingTime);
        eggsRepository.save(e);
    }
    public Iterable<Eggs> getAllEggs() {
        return eggsRepository.findAll();
    }
};