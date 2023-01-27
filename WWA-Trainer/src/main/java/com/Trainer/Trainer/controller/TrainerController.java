package com.Trainer.Trainer.controller;

import com.Trainer.Trainer.model.Trainer;
import com.Trainer.Trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

class ValueDto {
    public int value;
}
@RestController
@Controller
public class TrainerController {

    @Autowired
    private TrainerService trainerService;
    @CrossOrigin()
    @PostMapping(path="/trainers/addTrainer/{name}")
    public @ResponseBody Trainer addNewUser(@PathVariable String name) {
        return trainerService.saveTrainer(name);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addEgg/{idTrainer}")
    public @ResponseBody String addNewUser(@PathVariable int idTrainer, @RequestBody ValueDto idEgg) {
        trainerService.addEgg(idTrainer, idEgg.value);
        return "Saved";
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addPokeDollars/{idTrainer}")
    public Trainer addPokedollar(@PathVariable int idTrainer, @RequestBody ValueDto value) {
        return trainerService.addPokedollar(idTrainer, value.value);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/withdrawPokedollar/{idTrainer}")
    public int withdrawPokedollar(@PathVariable int idTrainer, @RequestBody ValueDto value) {
        return trainerService.withdrawPokedollar(idTrainer, value.value);
    }

    @CrossOrigin()
    @GetMapping(path="/trainers/allTrainers")
    public Iterable<Trainer> withdrawPokedollar() {
        return trainerService.allTrainers();
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addPokemon/{idTrainer}")
    public String addPokemon(@RequestParam int idTrainer, @RequestBody ValueDto idPokemon) {
        trainerService.addPokemon(idTrainer, idPokemon.value);
        return "Saved";
    }
    @CrossOrigin()
    @PostMapping(path="/trainers/withdrawPokemon/{idTrainer}")
    public String withdrawPokemon(@RequestParam int idTrainer, @RequestBody ValueDto idPokemon) {
        trainerService.withdrawPokemon(idTrainer, idPokemon.value);
        return "Saved";
    }
}
