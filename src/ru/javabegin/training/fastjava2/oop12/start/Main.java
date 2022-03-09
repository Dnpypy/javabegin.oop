package ru.javabegin.training.fastjava2.oop12.start;


import ru.javabegin.training.fastjava2.oop12.objects.Car;
import ru.javabegin.training.fastjava2.oop12.objects.Door;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Toyota");

        System.out.println("car.getName() = " + car.getName());

        Door door1 = new Door();
        door1.setColor("White");
        door1.setHeight(180);

        System.out.println("door1.getColor() = " + door1.getColor());
        System.out.println("door1.getHeight() = " + door1.getHeight());
    }
}
