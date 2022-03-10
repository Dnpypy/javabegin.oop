package ru.javabegin.training.fastjava2.oop21.objects;

public class Camry50 extends Camry30{

    @Override
    public void stop(){
        super.stop();
        System.out.println("Camry50 stop");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Camry50 drive");
    }
}
