package ru.javabegin.training.fastjava2.shop27.client;

import ru.javabegin.training.fastjava2.shop27.interfaces.VisitorInterfaces;

/**
 * Базовый класс
 */
public abstract class BaseVisitor implements VisitorInterfaces {

    private String name;

    public BaseVisitor(String name) {
        this.name = name;
    }

    public BaseVisitor() {

    }

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
