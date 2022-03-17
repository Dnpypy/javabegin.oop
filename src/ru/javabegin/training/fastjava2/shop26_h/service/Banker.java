package ru.javabegin.training.fastjava2.shop26_h.service;

import ru.javabegin.training.fastjava2.shop26_h.bank.BaseBank;

/**
 * Банкир
 * Отправка запроса
 * С помощью композиции включается переменная объекта BaseBank, каждый банкир будет иметь ссылку на
 * конкретный банк(Sberbank, VTB)
 * В этом классе и наследование extends BaseEmployee
 * и композиция BaseBank(ссылка)
 */
public class Banker extends BaseEmployee {

    private BaseBank bank;

    public void sendRequest() {

    }
}
