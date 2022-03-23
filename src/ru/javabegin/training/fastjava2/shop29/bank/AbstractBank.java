package ru.javabegin.training.fastjava2.shop29.bank;

import ru.javabegin.training.fastjava2.shop29.interfaces.BankInterfaces;

/**
 * Базовый класс Банк
 * проверка кредитной истории
 * выдача кредита
 * Название, условие кредита
 *
 * Общая реализация интерфейса BankInterfaces
 */
public abstract class AbstractBank implements BankInterfaces {

    private final String name;
    private final String creditDescription;
    public String info;

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    protected abstract String getInfo();

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
