package ru.javabegin.training.fastjava2.shop26.bank;

/**
 * Банк
 * проверка кредитной истории
 * выдача кредита
 * Название, условие кредита
 */
abstract public class BaseBank {

    private String name;
    private boolean creditDescription;

    abstract void checkInfo();

    abstract void giveCredit();


}
