package ru.javabegin.training.fastjava2.shop25_h.client;

/**
 *
 */
public class VipVisitor extends BaseVisitor {

    // private String name; не нужно опеределять переменную она уже есть
    // в родительском классе BaseVisitor
    private float discount;

    public void buy() {
        // если скидки нет
        if (!checkDiscount()) {
            buy(); // как обычный клиент
        } else {
            // купить со скидкой
        }
    }

    @Override
    public void returnOfGoods() {

    }

    private boolean checkDiscount() {
        return discount > 0;
    }

}
