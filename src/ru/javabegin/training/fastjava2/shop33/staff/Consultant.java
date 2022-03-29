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

    public Consultant(String consult) {
        super(consult);
    }

    public ConsultResult consult(VisitorInterfaces visitorInterfaces) {
        super.setFree(false);

        return ConsultResult.BUY;
    }

    public void send() {


    }
}
