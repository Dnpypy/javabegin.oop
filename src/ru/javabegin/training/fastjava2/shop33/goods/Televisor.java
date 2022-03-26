package ru.javabegin.training.fastjava2.shop33.goods;


/**
 *
 */
public class Televisor extends ElectronicDevice {

    private int model;
    private int numberChannel;
    private String nameChannel;

    public Televisor(String name) {
        super(name);
    }

    public void selectChannel() {
        System.out.print("Select Channel : ");

    }

    public void selectChannel(int numberChannel, String nameChannel) {
        this.numberChannel = numberChannel;
        this.nameChannel = nameChannel;
        System.out.print(numberChannel + " " + nameChannel);
    }
}
