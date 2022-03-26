package ru.javabegin.training.fastjava2.shop33.staff;

import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;

/**
 * Помощь посетителю/консультация
 * Передача посетителя другому консультанту
 *
 * */
public class Consultant extends AbstractStaff {

    public Consultant(String name, DepartmentInterfaces department, boolean free) {
        super(name, department, free);
    }

    public void consult() {

    }

    public void send() {


    }
}
