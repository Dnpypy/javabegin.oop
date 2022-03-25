package ru.javabegin.training.fastjava2.shop32.start;

import ru.javabegin.training.fastjava2.shop32.bank.AbstractBank;
import ru.javabegin.training.fastjava2.shop32.bank.Sberbank;
import ru.javabegin.training.fastjava2.shop32.bank.Vtb;

import static ru.javabegin.training.fastjava2.shop31.goods.AbstractGoods.DEFAULT_GUARANTEE;
import static ru.javabegin.training.fastjava2.shop31.goods.AbstractGoods.print;


public class Main {
    public static void main(String[] args) {
        Sberbank sberbank = new Sberbank("Sberbank", "Вклад");

        sberbank.checkInfo();
        sberbank.checkInfo();
        sberbank.checkInfo();

        System.out.println("sberbank.requestCount = " + AbstractBank.requestCount);

        Vtb vtb = new Vtb("Vtb ", "Вклад");

        vtb.checkInfo();
        vtb.checkInfo();

        System.out.println("vtb.requestCount = " + AbstractBank.requestCount);

        print();
        System.out.println(DEFAULT_GUARANTEE);
        System.out.println(AbstractBank.requestCount);
    }
}
