package ru.javabegin.training.fastjava2.oop15;

import ru.javabegin.training.fastjava2.oop15.objects.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(1024, "Samsung", "GSM");
        System.out.println("phone.getName() = " + phone.getName());
    }
}
