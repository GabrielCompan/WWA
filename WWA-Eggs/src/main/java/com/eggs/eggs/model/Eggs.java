package com.eggs.eggs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Eggs {
    private int id;
    private String name;
    private double price;
    private int hatchingTime;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getHatchingTime() {
        return hatchingTime;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setHatchingTime(int hatchingTime) {
        this.hatchingTime = hatchingTime;
    }

}