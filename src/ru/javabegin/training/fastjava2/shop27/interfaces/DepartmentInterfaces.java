package ru.javabegin.training.fastjava2.shop27.interfaces;

import java.util.ArrayList;

/**
 * Обязали, чтобы интерфейс содержал имя,
 * набор каких сотрудников и какихто товаров.
 *
 */
public interface DepartmentInterfaces {

    String getName();
    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<GoodsInterface> getGoodsList();

}
