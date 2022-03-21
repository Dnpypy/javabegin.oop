package ru.javabegin.training.fastjava2.shop26_h.interfaces;

/**
 * интерфейс(реализация линии поведения)
 * цена
 * есть ли гарантия
 * имя
 * к какому департаменту относится
 * и кампания, которая произвела этот товар
 *
 */
public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterfaces getDepartment();

    String getCompany();
}
