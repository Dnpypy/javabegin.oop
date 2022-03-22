package ru.javabegin.training.fastjava2.shop29.goods;

import ru.javabegin.training.fastjava2.shop29.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop29.interfaces.GoodsInterface;


/**
 * Базовый класс
 * свойства, которые будут иметь все товары
 */
public abstract class BaseGoods implements GoodsInterface {

    private double price;
    private boolean hasGuarantee;
    private String name;
    private BaseDepartment department;
    private String company;

    public BaseGoods(double price, boolean hasGuarantee, String name, BaseDepartment department, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.department = department;
        this.company = company;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BaseDepartment getDepartment() {
        return department;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean guarantee){
        this.hasGuarantee = guarantee;
    }


}
