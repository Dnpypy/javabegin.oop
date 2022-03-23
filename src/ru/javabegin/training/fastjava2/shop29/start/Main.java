package ru.javabegin.training.fastjava2.shop29.start;

import ru.javabegin.training.fastjava2.shop29.goods.Subwoofer;
import ru.javabegin.training.fastjava2.shop29.goods.Televisor;
import ru.javabegin.training.fastjava2.shop29.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop29.goods.Computer;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("JVC");
        Computer computer = new Computer("IBM");
        Computer computer1 = new Computer("ASUS");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer1);

        Subwoofer subwoofer = new Subwoofer("Sub");

        commonVisitor.buy(subwoofer);
    }
}
