package ru.javabegin.training.fastjava2.shop33.start;

import ru.javabegin.training.fastjava2.shop33.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop33.client.VipVisitor;
import ru.javabegin.training.fastjava2.shop33.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop33.goods.HardDrive;
import ru.javabegin.training.fastjava2.shop33.goods.Televisor;
import ru.javabegin.training.fastjava2.shop33.SalesRoom;
import ru.javabegin.training.fastjava2.shop33.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop33.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop33.goods.Computer;
import ru.javabegin.training.fastjava2.shop33.goods.GameConsole;
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

        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        Consultant consultant1 = new Consultant("Джон");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Карл");
        consultant2.setFree(true);

        electronicDepartment.addEmployee(consultant1);
        gameDepartment.addEmployee(consultant2);

        Televisor televisor = new Televisor(234.55, true, "SmartTV", "Samsung");
        HardDrive hardDrive = new HardDrive("Toshiba");
        Computer computer = new Computer(200.11, true, "xk134jf", "IBM", 2048);
        GameConsole console = new GameConsole("XBOX", 2048);

        electronicDepartment.addGoods(computer);
        electronicDepartment.addGoods(televisor);
        gameDepartment.addGoods(console);


        CommonVisitor  commonVisitor = new CommonVisitor("visitor1");
        VipVisitor vipVisitor = new VipVisitor("VipVisitor", 50);

        ConsultResult result = administrator.getFreeConsultant(electronicDepartment).consult(commonVisitor);

        switch (result) {
            case BUY:
                commonVisitor.buy(televisor);
                commonVisitor.buy(hardDrive);
                commonVisitor.buy(computer);
                commonVisitor.buy(console);
                break;
            case EXIT:
                break;
        }

    }
}
