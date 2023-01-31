package com.Trainer.Trainer.controller;

import com.Trainer.Trainer.model.Trainer;
import com.Trainer.Trainer.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
    public @ResponseBody Trainer addNewEgg(@PathVariable int idTrainer, @RequestBody ValueDto idEgg) {
        return trainerService.addEgg(idTrainer, idEgg.value);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/withDrawEgg/{idTrainer}")
    public @ResponseBody Trainer withdrawEgg(@PathVariable int idTrainer, @RequestBody ValueDto idEgg) {
        return trainerService.withdrawEgg(idTrainer, idEgg.value);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addPokeDollars/{idTrainer}")
    public Trainer addPokedollar(@PathVariable int idTrainer, @RequestBody ValueDto value) {
        return trainerService.addPokedollar(idTrainer, value.value);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/withdrawPokedollar/{idTrainer}")
    public Trainer withdrawPokedollar(@PathVariable int idTrainer, @RequestBody ValueDto value) {
        return trainerService.withdrawPokedollar(idTrainer, value.value);
    }

    @CrossOrigin()
    @GetMapping(path="/trainers/allTrainers")
    public Iterable<Trainer> allTrainers() {
        return trainerService.allTrainers();
    }

    @CrossOrigin()
    @GetMapping(path="/trainers/{idTrainer}")
    public Optional<Trainer> getTrainerbyId(@PathVariable int idTrainer) {
        return trainerService.trainerbyId(idTrainer);
    }

    @CrossOrigin()
    @PostMapping(path="/trainers/addPokemon/{idTrainer}")
    public Trainer addPokemon(@RequestParam int idTrainer, @RequestBody ValueDto idPokemon) {
        return trainerService.addPokemon(idTrainer, idPokemon.value);
    }
    @CrossOrigin()
    @PostMapping(path="/trainers/withdrawPokemon/{idTrainer}")
    public Trainer withdrawPokemon(@RequestParam int idTrainer, @RequestBody ValueDto idPokemon) {
        return trainerService.withdrawPokemon(idTrainer, idPokemon.value);

    }
}
