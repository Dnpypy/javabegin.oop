package ru.javabegin.training.fastjava2.shop26_h.interfaces;

/**
 * Каждый сотрудник будет иметь имя
 * Сотрудник должен предоставлять отдел, где он работает
 * Индикатор свободен он или нет
 */
public interface EmployeeInterface {

    String getName();
    DepartmentInterfaces getDepartment();
    boolean isFree();

}
