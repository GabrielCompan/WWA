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

    private int idTeam;
    private String nameEgg;

    private int idPokelist;

    private String name;

    public void addEgg(int idEgg) {
        this.eggs.add(new Egg(idEgg));
    }

    private enum type {User, Bot};

    private int pokeDollar;

    public int getId() {
        return id;
    }
    public int getIdTeam() {
        return idTeam;
    }
    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }
//    public int getIdEgg() {
//        return idEgg;
//    }
//    public void setIdEgg(int idEgg) {
//        this.idEgg = idEgg;
//    }
    public String getNameEgg() {
        return nameEgg;
    }
    public void setNameEgg(String nameEgg) {
        this.nameEgg = nameEgg;
    }
    public int getIdPokelist() {
        return idPokelist;
    }
    public void setIdPokelist(int idPokelist) {
        this.idPokelist = idPokelist;
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

