package com.eggs.eggs.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.eggs.eggs.repository.EggsRepository;
import com.eggs.eggs.model.Eggs;
import com.eggs.eggs.service.EggsService;
import com.eggs.eggs.repository.EggsRepository;
import java.sql.Array;
import java.util.List;
import java.util.ArrayList;

@RestController
@CrossOrigin
public class EggsController {

    @Autowired
    private EggsService eggsService;
    @CrossOrigin()
    @PostMapping(path="/eggs/add") // Map ONLY POST Requests
    public @ResponseBody String addNewEggs (@RequestParam int id)
    {
        String name = "Egg"+id;
        double price = Math.random() * (100 - 1) + 1;
        int hatchingTime = (int)(Math.random() * (500 - 30 + 1) + 30);

        eggsService.saveEggs(id, name, price, hatchingTime);
        return "Saved";
    }

    @CrossOrigin()
    @GetMapping("/eggs")
    public ResponseEntity<List<Eggs>> getEggs() {
        List<Eggs> eggs = (List<Eggs>) eggsService.getAllEggs();
        return ResponseEntity.ok(eggs);
    }
}