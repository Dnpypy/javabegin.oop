package ru.javabegin.training.fastjava2.shop29.department;

import ru.javabegin.training.fastjava2.shop29.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop29.interfaces.EmployeeInterface;
import ru.javabegin.training.fastjava2.shop29.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterfaces {

    /**
     * Базовый класс
     * Каждый отдел будет хранить работников BaseEmployee и также коллекция товаров
     * Имя отдела
     * Список сотрудников
     * Список товаров
     */

    public String name;
    ArrayList <GoodsInterface> goodsList;
    ArrayList <EmployeeInterface> employeeList;

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
