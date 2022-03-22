package ru.javabegin.training.fastjava2.shop27.goods;

import ru.javabegin.training.fastjava2.shop27.department.BaseDepartment;

/**
 *
 */
public class Computer extends ElectronicDevice {


    private int ram;

    public Computer(double price, boolean hasGuarantee, String name, BaseDepartment department, String company, int ram) {
        super(price, hasGuarantee, name, department, company);
        this.ram = ram;
    }

    public void loadOs() {

    }
}
