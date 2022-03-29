package ru.javabegin.training.fastjava2.shop33.goods;

import ru.javabegin.training.fastjava2.shop33.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.GoodsInterface;


/**
 * Базовый класс
 * свойства, которые будут иметь все товары
 */
public abstract class AbstractGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;

    private double price;
    private boolean guarantee;
    private String name;
    private DepartmentInterfaces department;
    private String company;

    public AbstractGoods(String name) {
        this.name = name;
    }

    public AbstractGoods() {
    }

    public AbstractGoods(double price, boolean guarantee, String name, String company) {
        this.price = price;
        this.guarantee = guarantee;
        this.name = name;
        this.company = company;
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
        return guarantee;
    }

    public void setHasGuarantee(boolean guarantee){
        this.guarantee = guarantee;
    }


}
