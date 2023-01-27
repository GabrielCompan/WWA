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
    @PostMapping(path="/trainers/addTrainer/{name}")
    public @ResponseBody String addNewUser(@PathVariable String name) {
        trainerService.saveTrainer(name);
        return "Saved";
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addEgg/{idTrainer}/{idEgg}")
    public @ResponseBody String addNewUser(@PathVariable int idTrainer, @PathVariable int idEgg) {
        trainerService.addEgg(idTrainer, idEgg);
        return "Saved";
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addPokedollar/{idTrainer}/{value}")
    public int addPokedollar(@PathVariable int idTrainer, @PathVariable int value) {
        return trainerService.addPokedollar(idTrainer, value);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/withdrawPokedollar/{idTrainer}/{value}")
    public int withdrawPokedollar(@PathVariable int idTrainer, @PathVariable int value) {
        return trainerService.withdrawPokedollar(idTrainer, value);
    }

    @CrossOrigin()
    @GetMapping(path="/trainers/allTrainers")
    public Iterable<Trainer> withdrawPokedollar() {
        return trainerService.allTrainers();
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addPokemon/{idTrainer}/{idPokemon}")
    public String addPokemon(@RequestParam int idTrainer, @RequestParam int idPokemon) {
        trainerService.addPokemon(idTrainer, idPokemon);
        return "Saved";
    }
    @CrossOrigin()
    @PostMapping(path="/trainers/withdrawPokemon/{idTrainer}/{idPokemon}")
    public String withdrawPokemon(@RequestParam int idTrainer, @RequestParam int idPokemon) {
        trainerService.withdrawPokemon(idTrainer, idPokemon);
        return "Saved";
    }
}
