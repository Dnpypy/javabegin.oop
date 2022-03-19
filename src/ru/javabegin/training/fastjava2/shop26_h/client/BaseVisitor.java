package ru.javabegin.training.fastjava2.shop26_h.client;

import ru.javabegin.training.fastjava2.shop26_h.interfaces.VisitorInterfaces;

public class BaseVisitor implements VisitorInterfaces {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void buy() {

    }

    @Override
    public void returnOfGoods() {

    }
}
