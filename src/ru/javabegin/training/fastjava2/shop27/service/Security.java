package ru.javabegin.training.fastjava2.shop27.service;


import ru.javabegin.training.fastjava2.shop27.interfaces.DepartmentInterfaces;

/**
 *      Охранник
 * • Проверка посетителей
 * • Открытие двери
 * • Закрытие двери
  */


public class Security extends BaseEmployee {

    public Security(String name, DepartmentInterfaces department, boolean free) {
        super(name, department, free);
    }

    void checkVisitor() {

    }

    void openDoor() {

    }

    void closeDoor() {

    }
}
