package com.store.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Egg {
    @Id
    private int idEgg;

    public Egg(int idEgg) {
        this.idEgg = idEgg;
    }
}