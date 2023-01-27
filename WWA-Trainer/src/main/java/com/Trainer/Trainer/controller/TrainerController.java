package com.Trainer.Trainer.controller;

import com.Trainer.Trainer.model.Trainer;
import com.Trainer.Trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class TrainerController {

    @Autowired
    private TrainerService trainerService;
    @CrossOrigin()
        @PostMapping(path="/Trainer")
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
    @PostMapping(path="/addPokedollar")
    public int addPokedollar(@RequestParam int value, @RequestParam int idtrainer) {
        return trainerService.addPokedollar(value, idtrainer);
    }

    @CrossOrigin()
    @PostMapping(path="/withdrawPokedollar")
    public int withdrawPokedollar(@RequestParam int value, @RequestParam int idtrainer) {
        return trainerService.withdrawPokedollar(value, idtrainer);
    }

    @CrossOrigin()
    @GetMapping(path="/allTrainers")
    public Iterable<Trainer> withdrawPokedollar() {
        return trainerService.allTrainers();
    }


}
