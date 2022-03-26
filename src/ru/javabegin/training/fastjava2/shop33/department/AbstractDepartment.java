package ru.javabegin.training.fastjava2.shop33.department;

import ru.javabegin.training.fastjava2.shop33.goods.ElectronicDevice;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop33.interfaces.EmployeeInterface;

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
    ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();
    ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();


    public AbstractDepartment() {
    }

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

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public abstract void addGoods(ElectronicDevice electronicDevice);

    /**
     * привязка сотрудника к отделу и добавление его в общую коллекцию
     *
     * @param employee сотрудник
     */
    public void addEmployee(EmployeeInterface employee) {
        employee.setDepartment(this); // <--- за данным сотрудником указан конкретный отдел с помощью ключевого слова this
        employeeList.add(employee);  // <--- и уже добавляем его в общую колекцию
    }

    /**
     * привязка товара к отделу и добавление его в общую коллекцию
     * @param goods любой товар
     */
    public void addGoods(GoodsInterface goods) {
        goods.setDepartment(this); //<----при добавлении товара для него автоматически прописывается отдел
        goodsList.add(goods); // <--- и уже добавляем его в общую колекцию
    }

}
