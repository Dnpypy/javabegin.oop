package ru.javabegin.training.fastjava2.shop33;

import ru.javabegin.training.fastjava2.shop33.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop33.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.VisitorInterfaces;
import ru.javabegin.training.fastjava2.shop33.staff.Administrator;

import java.io.File;
import java.util.ArrayList;


/**
 * Торговый зал
 * Отделы
 * Имя
 * Набор посетителей
 * Администратор
 *
 * Вместо базовых типов(BaseDepartment, BaseVisitor) тут указываем интерфейсы:
 * DepartmentInterfaces, VisitorInterfaces
 *
 */
public class SalesRoom {

    public final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterfaces> departmentList; // в каждом департаменте свои сотрудники

    private String name;

    private ArrayList<VisitorInterfaces> visitorList;

    private Administrator administrator;

    File file;

    public void add(DepartmentInterfaces interfaces) {
    }

}
