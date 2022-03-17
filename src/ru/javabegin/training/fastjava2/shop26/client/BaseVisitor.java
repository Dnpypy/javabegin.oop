package ru.javabegin.training.fastjava2.shop26.client;

abstract public class BaseVisitor {

    private String name;

    abstract public void buy() ;

    abstract public void returnOfGoods();
}
