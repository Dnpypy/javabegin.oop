package ru.javabegin.training.fastjava2.shop27.goods;

import ru.javabegin.training.fastjava2.shop27.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop27.interfaces.ElectronicDeviceInterfaces;

/**
 * Общая реализация для всех электронных устройств
 */
public class ElectronicDevice extends BaseGoods implements ElectronicDeviceInterfaces {


    public ElectronicDevice(double price, boolean guarantee, String name, BaseDepartment department, String company) {
        super();
    }

    @Override
    public void on() {
        //общая реализация
    }

    @Override
    public void off() {
        //общая реализация
    }
}
