package ru.javabegin.training.fastjava2.shop33.client;

import ru.javabegin.training.fastjava2.shop33.goods.Televisor;
import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;
import ru.javabegin.training.fastjava2.shop33.interfaces.VisitorInterfaces;

/**
 * Базовый абстрактный класс посетитель
 */
public abstract class AbstractVisitor implements VisitorInterfaces {

    public AbstractVisitor(String name) {
    }

    public AbstractVisitor(String name, float discount) {
    }

    public AbstractVisitor(float discount) {
    }

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

        if(goods instanceof Televisor) {
            ((Televisor)goods).selectChannel();
        }
    }

    @Override
    public void returnOfGoods(GoodsInterface goods) {

    }

    @Override
    public String getName() {
        return name;
    }

}
