package com.Trainer.Trainer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id
    private int idEgg;

    public Pokemon() {
    }
    public Pokemon(int idEgg) {
        this.idEgg = idEgg;
    }



}
