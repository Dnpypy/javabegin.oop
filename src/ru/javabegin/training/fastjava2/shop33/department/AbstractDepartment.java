package ru.javabegin.training.fastjava2.shop33.department;

import ru.javabegin.training.fastjava2.shop32.goods.Televisor;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop33.interfaces.StaffInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterfaces {

    /**
     * Базовый класс
     * Каждый отдел будет хранить работников BaseEmployee и также коллекция товаров
     * Имя отдела
     * Список сотрудников
     * Список товаров
     */

    public AbstractDepartment() {
    }

    public AbstractDepartment(String name) {
        this.name = name;
    }

    public String name;
    private ArrayList<StaffInterface> employeeList = new ArrayList<StaffInterface>();
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();

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

    public void addEmployee(StaffInterface staff) {
        staff.setDepartment(this);
        employeeList.add(staff);
    }

    public void addGoods(GoodsInterface goods) {
        goods.setDepartment(this);
        goodsList.add(goods);
    }

}
