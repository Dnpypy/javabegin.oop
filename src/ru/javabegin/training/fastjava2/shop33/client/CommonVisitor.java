package ru.javabegin.training.fastjava2.shop33.client;

import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;

/**
 *
 */
public class CommonVisitor extends AbstractVisitor {


    public CommonVisitor(String name) {
        super();
    }

    @Override
    public void returnOfGoods(GoodsInterface goods) {

    }
}
