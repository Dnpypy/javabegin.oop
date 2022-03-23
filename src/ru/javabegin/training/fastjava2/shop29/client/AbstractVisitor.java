package ru.javabegin.training.fastjava2.shop29.client;

import ru.javabegin.training.fastjava2.shop29.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop29.interfaces.VisitorInterfaces;

/**
 * Базовый абстрактный класс посетитель
 */
public abstract class AbstractVisitor implements VisitorInterfaces {

    private String name;


    /**
     * можно передать в этот метод любой из товаров
     * вывод имени товара
     * @param goods товар
     * реализация интерфейса GoodsInterface
     * элемент полиморфизма, когда вовремя запуска программы,
     * сюда попадает, какой либо объект,
     * который мы передаем и в зависимости от объекта будет вызываться метод getName()
     * именно у этого объекта
     */

    @Override
    public void buy(GoodsInterface goods) {
        System.out.println(goods.getName());
    }

    @Override
    public void returnOfGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }

}
