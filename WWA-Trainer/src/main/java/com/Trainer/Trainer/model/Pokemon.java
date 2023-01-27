package com.Trainer.Trainer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id
    private int idPokemon;

    public Pokemon() {
    }
    public Pokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }



}
