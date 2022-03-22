package ru.javabegin.training.fastjava2.shop27.goods;

import ru.javabegin.training.fastjava2.shop27.department.BaseDepartment;

/**
 *
 * */
public class Televisor extends ElectronicDevice {

    private int model;

    public Televisor(double price, boolean hasGuarantee, String name, BaseDepartment department, String company, int model) {
        super(price, hasGuarantee, name, department, company);
        this.model = model;
    }

    public void selectChannel() {

    }
}
