package ru.javabegin.training.fastjava2.shop32.staff;


import ru.javabegin.training.fastjava2.shop32.interfaces.DepartmentInterfaces;

/**
 *      Охранник
 * • Проверка посетителей
 * • Открытие двери
 * • Закрытие двери
  */


public class Security extends AbstractStaff {

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
