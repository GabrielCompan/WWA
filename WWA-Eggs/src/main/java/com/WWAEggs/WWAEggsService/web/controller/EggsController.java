package com.WWAEggs.WWAEggsService.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.List;
import java.util.ArrayList;

@RestController
public class EggsController {
    @CrossOrigin()
    class EggsList {
        public static void main(String[] args) {
            ArrayList<Eggs> eggsList = new ArrayList<Eggs>();

            eggsList.add(new Eggs(1, "Egg1", 17, 180));
            eggsList.add(new Eggs(2, "Egg2", 12, 120));
            eggsList.add(new Eggs(3, "Egg3", 14, 210));
            eggsList.add(new Eggs(4, "Egg4", 25, 300));
        }
    }
}