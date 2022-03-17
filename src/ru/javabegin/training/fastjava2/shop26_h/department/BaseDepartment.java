package ru.javabegin.training.fastjava2.shop26_h.department;

import ru.javabegin.training.fastjava2.shop26_h.goods.BaseGoods;
import ru.javabegin.training.fastjava2.shop26_h.service.BaseEmployee;

import java.util.ArrayList;

/**
 *
 *
 */
abstract public class BaseDepartment {

    /**
     * Каждый отдел будет хранить работников BaseEmployee и также коллекция товаров
     * Имя отдела
     * Список сотрудников
     * Список товаров
     */
    private String name;
    private ArrayList<BaseEmployee> employeeList;
    private ArrayList<BaseGoods> goodsList;
}
