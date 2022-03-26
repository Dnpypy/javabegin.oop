package ru.javabegin.training.fastjava2.shop33.client;

import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;

/**
 *
 */
public class VipVisitor extends AbstractVisitor {

    // private String name; не нужно опеределять переменную она уже есть
    // в родительском классе BaseVisitor
    private float discount;

    public VipVisitor(String name, int num) {
        super();
    }


    @Override
    public void buy(GoodsInterface goods) {
        // если скидки нет
        if (!checkDiscount()) {
            super.buy(goods); // как обычный клиент
        } else {
            // купить со скидкой
        }
    }

    @Override
    public void returnOfGoods(GoodsInterface goods) {

    }

    private boolean checkDiscount() {
        return discount > 0;
    }

}
