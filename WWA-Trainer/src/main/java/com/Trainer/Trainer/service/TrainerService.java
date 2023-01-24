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

};

