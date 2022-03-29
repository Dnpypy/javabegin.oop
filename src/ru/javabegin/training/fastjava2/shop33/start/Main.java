package ru.javabegin.training.fastjava2.shop33.start;

import ru.javabegin.training.fastjava2.shop33.SalesRoom;
import ru.javabegin.training.fastjava2.shop33.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop33.client.VipVisitor;
import ru.javabegin.training.fastjava2.shop33.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop33.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop33.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop33.goods.Computer;
import ru.javabegin.training.fastjava2.shop33.goods.GameConsole;
import ru.javabegin.training.fastjava2.shop33.goods.HardDrive;
import ru.javabegin.training.fastjava2.shop33.goods.Televisor;
import ru.javabegin.training.fastjava2.shop33.staff.Administrator;
import ru.javabegin.training.fastjava2.shop33.staff.Consultant;


public class Main {
    public static void main(String[] args) {
        imitateShopWorking();
    }

    private static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom();

        Administrator administrator = new Administrator(salesRoom);

        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        salesRoom.add(electronicDepartment);
        salesRoom.add(gameDepartment);

        Consultant consultant1 = new Consultant("Den");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Den");
        consultant2.setFree(true);

        electronicDepartment.addEmployee(consultant1);
        gameDepartment.addEmployee(consultant2);

        Computer computer = new Computer(200, true, "IBM", "pocketbook", 2048);
        GameConsole console = new GameConsole(250, "Xbox");
        HardDrive hardDrive = new HardDrive("TOshiba");
        Televisor televisor = new Televisor(300, false, "SmartTV", "SAMSUNG");

        electronicDepartment.addGoods(computer);
        electronicDepartment.addGoods(hardDrive);
        electronicDepartment.addGoods(televisor);

        gameDepartment.addGoods(console);

        CommonVisitor commonVisitor = new CommonVisitor("Visitor1");
        VipVisitor vipVisitor = new VipVisitor("VipVisitor1", 50);

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