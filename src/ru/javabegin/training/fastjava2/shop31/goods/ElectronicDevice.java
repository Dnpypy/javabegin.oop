package ru.javabegin.training.fastjava2.shop31.goods;


import ru.javabegin.training.fastjava2.shop31.interfaces.ElectronicDeviceInterfaces;

/**
 * Общая реализация для всех электронных устройств
 */
public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterfaces {


    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
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
