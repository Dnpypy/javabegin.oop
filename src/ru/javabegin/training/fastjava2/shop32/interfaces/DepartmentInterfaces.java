package ru.javabegin.training.fastjava2.shop32.interfaces;

import java.util.ArrayList;

/**
 * Обязали, чтобы интерфейс содержал имя,
 * набор каких сотрудников и какихто товаров.
 *
 */
public interface DepartmentInterfaces {

    String getName();
    ArrayList<StaffInterface> getEmployeeList();
    ArrayList<GoodsInterface> getGoodsList();

}
