package ru.javabegin.training.fastjava2.shop27.client;

import ru.javabegin.training.fastjava2.shop27.interfaces.VisitorInterfaces;

/**
 * Базовый абстрактный класс посетитель
 */
public abstract class BaseVisitor implements VisitorInterfaces {

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

    ///....

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
