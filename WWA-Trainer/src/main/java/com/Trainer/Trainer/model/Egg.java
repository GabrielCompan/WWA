package com.Trainer.Trainer.model;

import jakarta.persistence.*;

@Entity
public class Egg {
    @Id
    private int idEgg;

    public Egg() {
    }
    public Egg(int idEgg) {
        this.idEgg = idEgg;
    }



}
