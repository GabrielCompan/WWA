package com.hatching.hatching.model;
import java.sql.Timestamp;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Egg {
    @Id
    private int idEgg;
    private Timestamp timeStart;
    public Egg() {
    }
    public Egg(int idEgg) {
        this.idEgg = idEgg;
        this.timeStart = new Timestamp((System.currentTimeMillis()/1000));
    }

}