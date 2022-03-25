package ru.javabegin.training.fastjava2.shop31.interfaces;

/**
 *
 */
public interface VisitorInterfaces {

    String getName();

    void buy(GoodsInterface goods);

    void returnOfGoods(GoodsInterface goods);
}
