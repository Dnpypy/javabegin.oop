package ru.javabegin.training.fastjava2.shop32.goods;

import ru.javabegin.training.fastjava2.shop32.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop32.interfaces.GoodsInterface;


/**
 * Базовый класс
 * свойства, которые будут иметь все товары
 */
public abstract class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods() {
    }

    public AbstractGoods(double price, boolean guarantee, String model, String name) {
    }

    private double price;
    private boolean hasGuarantee;
    private String name;
    private DepartmentInterfaces department;
    private String company;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterfaces getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentInterfaces department) {
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
