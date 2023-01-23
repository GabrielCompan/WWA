package com.WWAEggs.WWAEggsService.web.controller;

public class Eggs {
    private int id;
    private String name;
    private double price;
    private int hatchingTime;

    public Eggs(int id, String name, double price, int hatchingTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hatchingTime = hatchingTime;
    }
}
