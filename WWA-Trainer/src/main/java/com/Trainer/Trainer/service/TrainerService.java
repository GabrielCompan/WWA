package com.Trainer.Trainer.service;

import com.Trainer.Trainer.model.Trainer;
import com.Trainer.Trainer.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TrainerService {
    @Autowired

    private TrainerRepository trainerRepository;

    public Trainer saveTrainer(String name) {
        Trainer n = new Trainer();
        n.setName(name);
        n.setPokeDollar(50);
        trainerRepository.save(n);
        return n;
    }

    public Trainer getTrainerbyId(int idtrainer) {
        return trainerRepository.findById(idtrainer).orElse(null);
    }

    public Trainer addEgg(int idEgg, int idTrainer) {
        Trainer trainer = getTrainerbyId(idTrainer);
        trainer.addEgg(idEgg);
        trainerRepository.save(trainer);
        return trainer;
    }

    public Trainer addPokedollar(int idTrainer, int value) {
        Trainer trainer = getTrainerbyId(idTrainer);
        int valuedb = trainer.getPokeDollar();
        trainer.setPokeDollar(valuedb + value);
        trainerRepository.save(trainer);
        return trainer;

    }

    public Trainer withdrawPokedollar(int idTrainer, int value) {
        Trainer trainer = getTrainerbyId(idTrainer);
        int valuedb = trainer.getPokeDollar();
        int newvalue = valuedb - value;
        if(newvalue < 0) {
            throw new IllegalArgumentException("PokeDollar cannot be negative");
        }
        else
        {
            trainer.setPokeDollar(newvalue);
        }
        trainerRepository.save(trainer);
        return trainer;

    }

    public Trainer addPokemon(int idTrainer, int idPokemon) {
        Trainer trainer = getTrainerbyId(idTrainer);
        trainer.addPokemon(idPokemon);
        trainerRepository.save(trainer);
        return trainer;
    }

    public Trainer withdrawPokemon(int idTrainer, int idPokemon) {
        Trainer trainer = getTrainerbyId(idTrainer);
        trainer.withdrawPokemon(idPokemon);
        trainerRepository.save(trainer);
        return trainer;
    }

    public Iterable<Trainer> allTrainers() {
        return trainerRepository.findAll();
    }

    public Optional<Trainer> trainerbyId(int idTrainer) {
        return trainerRepository.findById(idTrainer);
    }

    public Trainer withdrawEgg(int idTrainer, int value) {
        Trainer trainer = getTrainerbyId(idTrainer);
        trainer.withdrawEgg(value);
        trainerRepository.save(trainer);
        return trainer;
    }
}

