package com.Trainer.Trainer.repository;

import com.Trainer.Trainer.model.Trainer;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
    Optional<Trainer> findById(int id);

    void save(Optional<Trainer> trainer);
}

