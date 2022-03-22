package ru.javabegin.training.fastjava2.shop29.goods;

import ru.javabegin.training.fastjava2.shop29.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop29.interfaces.ElectronicDeviceInterfaces;

/**
 * Общая реализация для всех электронных устройств
 */
public class ElectronicDevice extends BaseGoods implements ElectronicDeviceInterfaces {

    public ElectronicDevice(double price, boolean hasGuarantee, String name, BaseDepartment department, String company) {
        super(price, hasGuarantee, name, department, company);
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
