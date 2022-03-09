package ru.javabegin.training.fastjava2.shop21.objects;

public class Camry50 extends Camry30 {

//    @Override
//    public void drive() {
//        //super.drive();
//        System.out.println("Camry50 Drive");
//    }

    public void light() {
        stop();
        super.stop();
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Camry50 Stop");
    }

}
