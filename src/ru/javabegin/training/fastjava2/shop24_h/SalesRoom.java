package ru.javabegin.training.fastjava2.shop24_h;

import ru.javabegin.training.fastjava2.shop24_h.client.BaseVisitor;
import ru.javabegin.training.fastjava2.shop24_h.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop24_h.service.Administrator;


import java.util.ArrayList;


/**
 * Торговый зал
 * Отделы
 * Имя
 * Набор посетителей
 * Администратор
 */
public class SalesRoom {

    private ArrayList<BaseDepartment> departmentList; // в каждом департаменте свои сотрудники

    private String name;

    private ArrayList<BaseVisitor> visitorList;

    private Administrator administrator;
}
