package ru.javabegin.training.fastjava2.shop33.goods;


import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.ElectronicDeviceInterfaces;

/**
 * Общая реализация для всех электронных устройств
 */
public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterfaces {


    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public ElectronicDevice(double price, boolean guarantee, String name, String company) {
        super(price, guarantee, name, company);
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
