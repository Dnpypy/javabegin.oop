package ru.javabegin.training.fastjava2.shop33.goods;


/**
 * */
public class GameConsole extends ElectronicDevice {

    private int ram;

    public GameConsole(String name) {
        super(name);
    }

    public GameConsole(String name, int ram) {
        super(name);
        this.ram = ram;
    }


    public void loadGame() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}
