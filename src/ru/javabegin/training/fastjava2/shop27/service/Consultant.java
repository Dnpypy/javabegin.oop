package ru.javabegin.training.fastjava2.shop27.service;

import ru.javabegin.training.fastjava2.shop27.interfaces.DepartmentInterfaces;

/**
 * Помощь посетителю/консультация
 * Передача посетителя другому консультанту
 *
 * */
public class Consultant extends BaseEmployee {

    public Consultant(String name, DepartmentInterfaces department, boolean free) {
        super(name, department, free);
    }

    public void consult() {

    }

    public void send() {


    }
}
