package com.eggs.eggs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.eggs.eggs.repository.EggsRepository;
import com.eggs.eggs.model.Eggs;
import com.eggs.eggs.repository.EggsRepository;

import java.sql.Array;
import java.util.List;
import java.util.ArrayList;

@RestController
public class EggsController {
    @Bean
    @CrossOrigin()
    @GetMapping("/eggs")
    public ArrayList<Eggs> main() {
        ArrayList<Eggs> eggsList = new ArrayList<Eggs>();

        eggsList.add(new Eggs(1, "Egg1", 17, 180));
        eggsList.add(new Eggs(2, "Egg2", 12, 120));
        eggsList.add(new Eggs(3, "Egg3", 14, 210));
        eggsList.add(new Eggs(4, "Egg4", 25, 300));

        return eggsList;

    }
}