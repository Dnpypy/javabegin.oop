package ru.javabegin.training.fastjava2.shop32.interfaces;

/**
 * Каждый сотрудник будет иметь имя
 * Сотрудник должен предоставлять отдел, где он работает
 * Индикатор свободен он или нет
 */
public interface StaffInterface {

    String getName();
    DepartmentInterfaces getDepartment();
    boolean isFree();

}
