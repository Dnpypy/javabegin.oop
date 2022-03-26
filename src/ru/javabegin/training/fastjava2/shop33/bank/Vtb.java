package ru.javabegin.training.fastjava2.shop33.bank;

public class Vtb extends AbstractBank {

    public Vtb(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    protected String getInfo() {
        return null;
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {

    }
}
