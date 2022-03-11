package ru.javabegin.training.fastjava2.oop22.objects;

public class Toyota {

    private String name;
    private double volume;

    // --------- Конструкторы --------------

    public Toyota(String name, double volume) {
        this.name = name;
        this.volume = volume;
        System.out.println("Toyota constr");
    }

    public Toyota(String name) {
        this.name = name;
        System.out.println("Toyota constr");
    }

    public Toyota(double volume) {
        this.volume = volume;
    }

//    public Toyota() {
//
//    }

    // --------- Геттеры и сеттеры --------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
