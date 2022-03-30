package ru.javabegin.training.fastjava2.shop32.goods;


import ru.javabegin.training.fastjava2.shop32.interfaces.ElectronicDeviceInterfaces;

/**
 * Общая реализация для всех электронных устройств
 */
public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterfaces {


    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public ElectronicDevice(double price, boolean guarantee, String model, String name) {
        super(price, guarantee, model, name);
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
