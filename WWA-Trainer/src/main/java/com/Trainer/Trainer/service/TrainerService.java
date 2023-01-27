package com.Trainer.Trainer.service;

import com.Trainer.Trainer.model.Trainer;
import com.Trainer.Trainer.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrainerService {
    @Autowired

    private TrainerRepository trainerRepository;

    public void saveTrainer(String name) {
        Trainer n = new Trainer();
        n.setName(name);
        n.setPokeDollar(50);
        n.setIdPokelist(98);
        trainerRepository.save(n);
    }
    public Iterable<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }

    public Trainer getTrainerbyId(int idtrainer) {
        return trainerRepository.findById(idtrainer).orElse(null);
    }

    public void addEgg(int idEgg, int idTrainer) {
        Trainer trainer = getTrainerbyId(idTrainer);
        trainer.addEgg(idEgg);
        trainerRepository.save(trainer);
    }

    public int addPokedollar(int value, int idTrainer) {
        Trainer trainer = getTrainerbyId(idTrainer);
        int valuedb = trainer.getPokeDollar();
        trainer.setPokeDollar(valuedb + value);
        trainerRepository.save(trainer);
        return valuedb + value;

    }

    public int withdrawPokedollar(int value, int idTrainer) {
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
        return newvalue;

    }

    public Iterable<Trainer> allTrainers() {
        return trainerRepository.findAll();
    }
};

