package ru.javabegin.training.fastjava2.shop33.staff;

import ru.javabegin.training.fastjava2.shop33.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.VisitorInterfaces;

/**
 * Помощь посетителю/консультация
 * Передача посетителя другому консультанту
 *
 * */
public class Consultant extends AbstractStaff {

    public Consultant(String name, DepartmentInterfaces department, boolean free) {
        super(name, department, free);
    }

    public Consultant(String name) {
        super(name);
    }

    public void consult() {

    }

    public void send() {


    }

    public ConsultResult consult(VisitorInterfaces visitor){
        super.setFree(false);
        return ConsultResult.BUY;
    }
}
