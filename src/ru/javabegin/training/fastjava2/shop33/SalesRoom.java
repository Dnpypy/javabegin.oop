package ru.javabegin.training.fastjava2.shop33;


import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.VisitorInterfaces;

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

    public static final String SHOP_NAME = "technodom";

    // в каждом департаменте свои сотрудники
    private ArrayList<DepartmentInterfaces> departmentList = new ArrayList<DepartmentInterfaces>();

    private ArrayList<VisitorInterfaces> visitorList = new ArrayList<VisitorInterfaces>();

    private ArrayList <DepartmentInterfaces> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterfaces department) {
        departmentList.add(department);
    }

    public void addVisitor(VisitorInterfaces visitorInterfaces) {
        visitorList.add(visitorInterfaces);
    }

}
