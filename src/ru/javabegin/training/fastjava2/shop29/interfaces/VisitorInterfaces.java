package ru.javabegin.training.fastjava2.shop29.interfaces;

/**
 *
 */
public interface VisitorInterfaces {

    String getName();

    void buy(GoodsInterface goods);

    void returnOfGoods(GoodsInterface goods);
}
