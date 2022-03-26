package ru.javabegin.training.fastjava2.shop33.service;

import ru.javabegin.training.fastjava2.shop33.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop33.interfaces.BankInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;

/**
 * Банкир
 * Отправка запроса
 * С помощью композиции включается переменная объекта BaseBank, каждый банкир будет иметь ссылку на
 * конкретный банк(Sberbank, VTB)
 * В этом классе и наследование extends BaseEmployee
 * и композиция BaseBank(ссылка)
 *
 * Вместо поля типа BaseBank делаю общий тип Интерфейс BankInterfaces
 * (т.е. банкир работал не только в одном какомто банке, а любом например,
 * то ставлю любой тип)
 */
public class Banker extends AbstractEmployee {

    private BankInterfaces bank;

    public Banker(String name) {
        super(name);
    }


    public void sendRequest() {

    }


}
