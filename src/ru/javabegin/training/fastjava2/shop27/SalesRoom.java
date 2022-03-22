package ru.javabegin.training.fastjava2.shop27;

import ru.javabegin.training.fastjava2.shop27.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop27.interfaces.VisitorInterfaces;
import ru.javabegin.training.fastjava2.shop27.service.Administrator;

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

    private ArrayList<DepartmentInterfaces> departmentList; // в каждом департаменте свои сотрудники

    private String name;

    private ArrayList<VisitorInterfaces> visitorList;

    private Administrator administrator;

    File file;
}
