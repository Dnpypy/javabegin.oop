package ru.javabegin.training.fastjava2.shop30.start;

import ru.javabegin.training.fastjava2.shop30.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop30.goods.Televisor;
import ru.javabegin.training.fastjava2.shop30.interfaces.GoodsInterface;

public class Main {
    public static void main(String[] args) {
        GoodsInterface goods = new Televisor("Samsung");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(goods);

        Televisor t = (Televisor) goods;
        t.selectChannel();

        ((Televisor)goods).selectChannel();


    }
}
