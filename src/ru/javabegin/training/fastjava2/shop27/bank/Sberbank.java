package ru.javabegin.training.fastjava2.shop27.bank;


/**
 * Использует свою реализацию
 */
public class Sberbank extends BaseBank {

    public Sberbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        //Доработанная реализация
    }

    @Override
    public void giveCredit() {
        //Доработанная реализация
    }
}
