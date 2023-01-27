package com.Trainer.Trainer.model;
import jakarta.persistence.*;
import java.util.List;


@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Egg> eggs;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pokemon> Pokemons;

    private String name;

    public void addEgg(int idEgg) {
        this.eggs.add(new Egg(idEgg));
    }

    public void addPokemon(int idPokemon) {
        this.Pokemons.add(new Pokemon(idPokemon));

    }

    public void withdrawPokemon(int idPokemon) {
        this.Pokemons.remove(new Pokemon(idPokemon));
    }

    private enum type {User, Bot};
        private int pokeDollar;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPokeDollar() {
        return pokeDollar;
    }
    public void setPokeDollar(int pokeDollar) {
        this.pokeDollar = pokeDollar;
    }

}

