package ru.javabegin.training.fastjava2.shop33.interfaces;

/**
 *
 */
public interface VisitorInterfaces {

    String getName();

    void buy(GoodsInterface goods);

    void returnOfGoods(GoodsInterface goods);
}
