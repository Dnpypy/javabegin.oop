package ru.javabegin.training.fastjava2.shop27.service;

import ru.javabegin.training.fastjava2.shop27.interfaces.BankInterfaces;
import ru.javabegin.training.fastjava2.shop27.interfaces.DepartmentInterfaces;

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
public class Banker extends BaseEmployee {

    private BankInterfaces bank;

    public Banker(String name, DepartmentInterfaces department, boolean free) {
        super(name, department, free);
    }


    public void sendRequest() {

    }
}
