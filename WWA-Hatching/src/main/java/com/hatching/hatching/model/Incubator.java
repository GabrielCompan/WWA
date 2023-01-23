package com.hatching.hatching.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity // This tells Hibernate to make a table out of this class
public class Incubator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int idEgg;

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

    public int getIdEgg() {
        return idEgg;
    }

    public void setIdEgg(int idEgg) {
        this.idEgg = idEgg;
    }

}