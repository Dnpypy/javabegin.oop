package ru.javabegin.training.fastjava2.shop27.bank;

import ru.javabegin.training.fastjava2.shop27.interfaces.BankInterfaces;

/**
 * Базовый класс Банк
 * проверка кредитной истории
 * выдача кредита
 * Название, условие кредита
 *
 * Общая реализация интерфейса BankInterfaces
 */
public class BaseBank implements BankInterfaces {

    private String name;
    private String creditDescription;

    @Override
    public void checkInfo() {
        //стандартная реализация
    }

    @Override
    public void giveCredit() {
        //стандартная реализация
    }
    @Override
    public String getName(){
        //стандартная реализация
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
