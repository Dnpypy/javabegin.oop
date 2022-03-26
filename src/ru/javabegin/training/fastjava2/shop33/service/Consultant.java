package ru.javabegin.training.fastjava2.shop33.service;

import ru.javabegin.training.fastjava2.shop33.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop33.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop33.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop33.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.VisitorInterfaces;

/**
 * Помощь посетителю/консультация
 * Передача посетителя другому консультанту
 *
 * */
public class Consultant extends AbstractEmployee {

    public Consultant() {

    }

    public Consultant(String name) {
        super(name);
    }

    /**
     * консультант дает консультанцию посетителю
     * @param visitorInterfaces посетитель
     * @return либо BUY, либо EXIT
     */
    public ConsultResult consult(VisitorInterfaces visitorInterfaces) {
        super.setFree(false); // <--- вначале консультант становится занятым

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;
    }

    public void send() {


    }

}
