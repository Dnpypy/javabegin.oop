package ru.javabegin.training.fastjava2.shop32.interfaces;

/**
 *
 */
public interface BankInterfaces {

    /**
     * методы действия, функционала
     */
    void checkInfo();
    void giveCredit();

    /**
     * чтобы все банки предоставляли свое имя
     */
    String getName();

    /**
     * все банки обязаны предоставлять информацию о кредите
     */
    String getCreditDescription();
}
