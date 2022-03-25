package ru.javabegin.training.fastjava2.shop32.department;

import ru.javabegin.training.fastjava2.shop32.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop32.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop32.interfaces.StaffInterface;

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
    ArrayList <StaffInterface> employeeList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<StaffInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<StaffInterface> employeeList) {
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
