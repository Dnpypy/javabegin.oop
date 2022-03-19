package ru.javabegin.training.fastjava2.shop26_h.bank;

import ru.javabegin.training.fastjava2.shop26_h.interfaces.BankInterfaces;

/**
 * Банк
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
