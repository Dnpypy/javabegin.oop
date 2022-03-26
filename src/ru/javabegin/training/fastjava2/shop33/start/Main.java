package ru.javabegin.training.fastjava2.shop33.start;


import ru.javabegin.training.fastjava2.shop33.SalesRoom;
import ru.javabegin.training.fastjava2.shop33.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop33.client.VipVisitor;
import ru.javabegin.training.fastjava2.shop33.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop33.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop33.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop33.goods.Computer;
import ru.javabegin.training.fastjava2.shop33.goods.GameConsole;
import ru.javabegin.training.fastjava2.shop33.goods.Televisor;
import ru.javabegin.training.fastjava2.shop33.service.Administrator;
import ru.javabegin.training.fastjava2.shop33.service.Consultant;

/**
 * • Реализовать работу приложения
 * <p>
 * • Создание торгового зала
 * <p>
 * Очистить класс Main
 * <p>
 * Создать объект торговый зал
 * <p>
 * Добавить сотрудников в зал и товары
 * <p>
 * • Добавление посетителей
 * <p>
 * • Работа администратора (поиск и предоставление консультанта)
 * <p>
 * • Консультация и покупка товара
 */
public class Main {
    public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking(){
        // Создаем торговый зал
        SalesRoom salesRoom = new SalesRoom();

        // Создаем администратора торгового зала, передаем ему управление торгового зала
        Administrator administrator = new Administrator(salesRoom);

        // Создаем два отдела
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // Добавляю отделы в торговый зал
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // Добавляю сотрудников в каждый отдел
        Consultant consultant1 = new Consultant("Denis");
        //  Проверяю свободен ли сотрудник.
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Elena");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant2);


        // Создаем товары для отделов
        Computer computer = new Computer(200, true, "Book", "IBM", 2046);
        Televisor televisor = new Televisor(1000, false, "SmartTv", "Samsung");
        GameConsole gameConsole = new GameConsole("Xbox", 1024);

        // Добавляем товары в отделы
        electronicDepartment.addGoods(computer);
        electronicDepartment.addGoods(televisor);
        gameDepartment.addGoods(gameConsole);

        // Создаем покупателей
        CommonVisitor commonVisitor = new CommonVisitor("Август");
        VipVisitor vipVisitor = new VipVisitor("Марк", 50);

        // Ищем свободного покупаетя из нужного отдела
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(commonVisitor);

        switch (consultResult) {
            case BUY:
                commonVisitor.buy(televisor);
                break;
            case EXIT:
                break;
        }
    }
}
