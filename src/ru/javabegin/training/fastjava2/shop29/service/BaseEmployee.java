package ru.javabegin.training.fastjava2.shop29.service;

import ru.javabegin.training.fastjava2.shop29.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop29.interfaces.EmployeeInterface;

/**
 * Базовый класс Сотрудник
 * Имя, к какому департаменту привязан, индикатор свободен он или нет
 *
 * В поле DepartmentInterfaces использую более общий тип заместо BaseDepartment
 * (находится выше всех остальных по иерархии)
 */

public abstract class BaseEmployee implements EmployeeInterface {

    private String name;
    private DepartmentInterfaces department;
    private boolean free;

    public BaseEmployee(String name, DepartmentInterfaces department, boolean free) {
        this.name = name;
        this.department = department;
        this.free = free;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterfaces getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterfaces department) {
        this.department = department;
    }

    @Override
    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
