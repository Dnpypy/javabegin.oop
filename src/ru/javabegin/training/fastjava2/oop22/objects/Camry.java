package ru.javabegin.training.fastjava2.oop22.objects;

public class Camry extends Toyota{

    // Важно чтобы соблюдалось цепочка вызовов конструторов
    // класс Camry пытается притянуть все конструкторы
    // Проблема решается созданием пустого конструтора в родит классе
    public Camry(String name){
        super(name);
        System.out.println("Camry constr");
    }
}
