package ru.javabegin.training.fastjava2.shop26_h.interfaces;

/**
 * Каждый сотрудник будет иметь имя
 *
 *
 * Индикатор свободен он или нет
 */
public interface EmployeeInterface {

    String getName();
    DepartmentInterfaces getDepartment();
    boolean isFree();

}
