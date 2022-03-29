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

    public Televisor(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }
    public void selectChannel() {

    }

    public void selectChannel(int numberChannel, String nameChannel) {
        this.numberChannel = numberChannel;
        this.nameChannel = nameChannel;
        System.out.print(numberChannel + " " + nameChannel);
    }
}
