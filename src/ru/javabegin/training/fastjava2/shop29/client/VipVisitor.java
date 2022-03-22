package ru.javabegin.training.fastjava2.shop29.client;

/**
 *
 */
public class VipVisitor extends BaseVisitor {

    // private String name; не нужно опеределять переменную она уже есть
    // в родительском классе BaseVisitor
    private float discount;

    public VipVisitor(float discount) {
        super();
        this.discount = discount;
    }

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public void buy() {
        // если скидки нет
        if (!checkDiscount()) {
            super.buy(); // как обычный клиент
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
