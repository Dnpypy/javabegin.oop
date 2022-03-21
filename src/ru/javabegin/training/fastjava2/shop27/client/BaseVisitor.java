package ru.javabegin.training.fastjava2.shop27.client;

import ru.javabegin.training.fastjava2.shop27.interfaces.VisitorInterfaces;

/**
 * Базовый класс
 */
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
