package ru.javabegin.training.fastjava2.shop33.client;

import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;

/**
 *
 */
public class VipVisitor extends AbstractVisitor {

    public VipVisitor(float discount){
        super(discount);
        this.discount = discount;
    }

    public VipVisitor(String name, float discount) {
        super(name, discount);
        this.discount = discount;

    }

    // private String name; не нужно дублировать переменную, она уже есть в родительском классе Visitor
    private final float discount;

    @Override
    public void buy(GoodsInterface goods) {
        // если скидки нет
        if (!checkDiscount()) {
            super.buy(goods); // как обычный клиент
        } else {
            // купить со скидкой
        }
    }

    private boolean checkDiscount() {
        return discount > 0;
    }

}
