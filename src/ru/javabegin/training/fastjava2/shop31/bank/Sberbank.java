package ru.javabegin.training.fastjava2.shop31.bank;


/**
 * Использует свою реализацию
 */
public class Sberbank extends AbstractBank {

    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public String getInfo() {
        System.out.println(info);
        return null;
    }

    @Override
    public void checkInfo() {
        //Доработанная реализация
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        //Доработанная реализация
    }

    //сбербанк также умеет расматривать срочные заявки с помощью перегруженного метода
    //.. { ... }
}
