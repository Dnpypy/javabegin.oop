package ru.javabegin.training.fastjava2.shop27.goods;

import ru.javabegin.training.fastjava2.shop27.department.BaseDepartment;

/**
 * */
public class GameConsole extends ElectronicDevice {

    private int ram;

    public GameConsole(double price, boolean hasGuarantee, String name, BaseDepartment department, String company, int ram) {
        super(price, hasGuarantee, name, department, company);
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
