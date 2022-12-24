package com.dicoding.javafundamental.generics;

public class Planet {
    private String name;
    private double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.name = mass;
    }

    public void print() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}
