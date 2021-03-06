package ru.javabegin.training.fastjava2.shop31.goods;

import ru.javabegin.training.fastjava2.shop31.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop31.interfaces.GoodsInterface;


/**
 * Базовый класс
 * свойства, которые будут иметь все товары
 */
public abstract class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    private double price;
    private boolean hasGuarantee;
    private String name;
    private AbstractDepartment department;
    private String company;

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods() {
    }

    public static void print(){
        System.out.println("DEFAULT_GUARANTEE = " + DEFAULT_GUARANTEE);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public AbstractDepartment getDepartment() {
        return department;
    }

    public void setDepartment(AbstractDepartment department) {
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
