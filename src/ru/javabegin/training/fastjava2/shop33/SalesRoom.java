package ru.javabegin.training.fastjava2.shop33;

import ru.javabegin.training.fastjava2.shop33.department.ElectronicDepartment;
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
 * // ArrayList<DepartmentInterfaces> в каждом департаменте свои сотрудники
 */
public class SalesRoom {

    public final String SHOP_NAME = "technodom";

    private final ArrayList<DepartmentInterfaces> departmentList = new ArrayList<DepartmentInterfaces>();

    private final ArrayList<VisitorInterfaces> visitorList = new ArrayList<VisitorInterfaces>();

    public ArrayList<DepartmentInterfaces> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterfaces department) {
        departmentList.add(department);
    }

    public void addVisitor(VisitorInterfaces visitor){
        visitorList.add(visitor);
    }
}
