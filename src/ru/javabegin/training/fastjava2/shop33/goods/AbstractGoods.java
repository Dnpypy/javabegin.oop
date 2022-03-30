package ru.javabegin.training.fastjava2.shop33.goods;

import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;


/**
 * Базовый класс
 * свойства, которые будут иметь все товары
 */
public abstract class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    private double price;
    private boolean hasGuarantee;
    private String name;
    private DepartmentInterfaces department;
    private String company;

    public AbstractGoods() {
    }

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods(double price, boolean hasGuarantee, String name, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.name = name;
        this.company = company;
    }

    public AbstractGoods(double price, boolean guarantee, String name, String company, int ram) {
    }


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

    @Override
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
