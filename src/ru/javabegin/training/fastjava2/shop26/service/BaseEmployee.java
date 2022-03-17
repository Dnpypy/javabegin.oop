package ru.javabegin.training.fastjava2.shop26.service;

import ru.javabegin.training.fastjava2.shop26.department.BaseDepartment;

/**
 * Базовый класс Сотрудник
 * Имя, к какому департаменту привязан, индикатор свободен он или нет
 */

abstract public class BaseEmployee  {

    private String name;
    private BaseDepartment department;
    private boolean free;

}
