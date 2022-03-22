package ru.javabegin.training.fastjava2.shop29.goods;


import ru.javabegin.training.fastjava2.shop29.department.BaseDepartment;

/**
 * тарелка - не эл. устройство, не должно уметь включать и выключаться
 */
public class Plate extends BaseGoods {

    public Plate(double price, boolean hasGuarantee, String name, BaseDepartment department, String company) {
        super(price, hasGuarantee, name, department, company);
    }
}
