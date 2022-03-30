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


    public ElectronicDevice(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name , company);
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price,hasGuarantee, name, company, ram);
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
