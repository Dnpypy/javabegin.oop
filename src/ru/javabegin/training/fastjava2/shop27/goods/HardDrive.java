package ru.javabegin.training.fastjava2.shop27.goods;

import ru.javabegin.training.fastjava2.shop27.department.BaseDepartment;

/**
 * */
public class HardDrive extends ElectronicDevice {

    private int volume;

    public HardDrive(double price, boolean hasGuarantee, String name, BaseDepartment department, String company, int volume) {
        super(price, hasGuarantee, name, department, company);
        this.volume = volume;
    }

    public void format() {

    }

    public void copy() {

    }

    public void delete() {

    }

    @Override
    public void on() {
        // специфическое включение жесткого диска
    }

    @Override
    public void off() {
        // специфическое включение жесткого диска
    }
}
