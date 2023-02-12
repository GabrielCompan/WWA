package com.hatching.hatching.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Incubator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Egg> eggs;
    public void addEgg(int idEgg) {
        this.eggs.add(new Egg(idEgg));
    }

    public void withdrawEgg(int idEgg) {
        this.eggs.remove(new Egg(idEgg));
    }
    private String nameEgg;

    private Timestamp timeStart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEgg() {
        return nameEgg;
    }

    public void setNameEgg(String nameEgg) {
        this.nameEgg = nameEgg;
    }

    public Timestamp getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Timestamp timeStart) {
        this.timeStart = timeStart;
    }

    public Collection<Object> getEggs() {
        return Collections.singleton(eggs);
    }
    public int getEggId() {
        return eggs.get(0).getId();
    }
}