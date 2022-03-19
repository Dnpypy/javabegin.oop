package ru.javabegin.training.fastjava2.shop26_h.department;

import ru.javabegin.training.fastjava2.shop26_h.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop26_h.interfaces.EmployeeInterface;
import ru.javabegin.training.fastjava2.shop26_h.interfaces.GoodsInterface;

import java.util.ArrayList;

/**
 *
 *
 */
public class BaseDepartment implements DepartmentInterfaces {

    /**
     * Каждый отдел будет хранить работников BaseEmployee и также коллекция товаров
     * Имя отдела
     * Список сотрудников
     * Список товаров
     */
    //...
    //...
    ///...

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }
}
