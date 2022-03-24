package ru.javabegin.training.fastjava2.shop30.goods;


/**
 *
 * */
public class Televisor extends ElectronicDevice {

    private int model;

    public Televisor(String name) {
        super(name);
    }

    public void selectChannel() {
        System.out.println("Select Channel");

    }
}
