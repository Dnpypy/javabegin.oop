package ru.javabegin.training.fastjava2.shop33.goods;


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

    public ElectronicDevice(int i, boolean b, String smartTv, String samsung) {
    }

    public ElectronicDevice(int i, boolean b, String book, String ibm, int i1) {
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
