package ru.javabegin.training.fastjava2.shop26_h;

import ru.javabegin.training.fastjava2.shop26_h.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop26_h.interfaces.VisitorInterfaces;
import ru.javabegin.training.fastjava2.shop26_h.service.Administrator;

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

    private ArrayList<DepartmentInterfaces> departmentList; // в каждом департаменте свои сотрудники

    private String name;

    private ArrayList<VisitorInterfaces> visitorList;

    private Administrator administrator;
}
