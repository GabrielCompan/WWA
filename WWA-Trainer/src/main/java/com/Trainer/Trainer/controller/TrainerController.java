package com.Trainer.Trainer.controller;

import com.Trainer.Trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.Trainer.Trainer.model.Trainer;

import java.util.List;

@RestController
@Controller
public class TrainerController {

    @Autowired
    private TrainerService trainerService;
    @CrossOrigin()
    @PostMapping(path="/saveTrainer")
    public @ResponseBody String addNewUser(@RequestParam String name) {
        trainerService.saveTrainer(name);
        return "Saved";
    }

    @CrossOrigin()
    @PostMapping(path="/addegg")
    public @ResponseBody String addNewUser(@RequestParam int idegg, @RequestParam int idtrainer) {
        trainerService.addEgg(idegg, idtrainer);
        return "Saved";
    }

    @CrossOrigin()
    @PostMapping(path="/getalltrainers")
    public @ResponseBody ResponseEntity<List<Trainer>> addNewUser() {
        List<Trainer> trainers = (List<Trainer>) trainerService.getAllTrainers();
        return ResponseEntity.ok(trainers);

    }
}
