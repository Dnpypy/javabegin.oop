package ru.javabegin.training.fastjava2.shop26_h.goods;

import ru.javabegin.training.fastjava2.shop26_h.SalesRoom;
import ru.javabegin.training.fastjava2.shop26_h.interfaces.ElectronicDeviceInterfaces;

/**
 *
 */
public class Computer extends SalesRoom implements ElectronicDeviceInterfaces {

    private String name;
    private int ram;
    private String department;


    void loadOs() {

    }
}
