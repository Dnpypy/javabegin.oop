package ru.javabegin.training.fastjava2.shop27.service;

import ru.javabegin.training.fastjava2.shop27.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop27.interfaces.EmployeeInterface;

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
