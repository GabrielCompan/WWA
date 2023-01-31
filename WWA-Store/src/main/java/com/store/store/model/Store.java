package com.store.store.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)

    private List<Egg> eggs;

    private String nameEgg;

    public void addEgg(int idEgg) {
        this.eggs.add(new Egg(idEgg));
    }
}