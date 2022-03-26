package ru.javabegin.training.fastjava2.shop33.client;

import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop33.interfaces.VisitorInterfaces;

/**
 * Базовый абстрактный класс посетитель
 */
public abstract class AbstractVisitor implements VisitorInterfaces {


    private String name;

    public AbstractVisitor() {
    }

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(GoodsInterface goods){
        System.out.println("buy "+goods.getName());
    }


    @Override
    public String getName() {
        return name;
    }

}
