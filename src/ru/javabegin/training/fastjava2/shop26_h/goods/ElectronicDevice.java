package ru.javabegin.training.fastjava2.shop26_h.goods;

import ru.javabegin.training.fastjava2.shop26_h.interfaces.ElectronicDeviceInterfaces;

/**
 * Общая реализация для всех электронных устройств
 */
public class ElectronicDevice extends BaseGoods implements ElectronicDeviceInterfaces {

    @Override
    public void on() {
        //общая реализация
    }

    @Override
    public void off() {
        //общая реализация
    }
}
