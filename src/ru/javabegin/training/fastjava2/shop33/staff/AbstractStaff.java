package ru.javabegin.training.fastjava2.shop33.staff;

import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.StaffInterface;

/**
 * Базовый класс Сотрудник
 * Имя, к какому департаменту привязан, индикатор свободен он или нет
 *
 * В поле DepartmentInterfaces использую более общий тип заместо BaseDepartment
 * (находится выше всех остальных по иерархии)
 */

public abstract class AbstractStaff implements StaffInterface {

    private String name;
    private DepartmentInterfaces department;
    private boolean free;

    public AbstractStaff(String name, DepartmentInterfaces department, boolean free) {
    }

    public AbstractStaff(String den) {
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

    @Override
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
