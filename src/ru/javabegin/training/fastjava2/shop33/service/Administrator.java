package ru.javabegin.training.fastjava2.shop33.service;

import ru.javabegin.training.fastjava2.shop33.SalesRoom;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.EmployeeInterface;

public class Administrator {

    private final SalesRoom salesRoom;

    /**
     * с помощью этого конструктора узнаем к каком торговому залу относится администратор
     * @param salesRoom торговый зал
     */
    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterfaces departmentInterfaces) {
        for (EmployeeInterface employee : departmentInterfaces.getEmployeeList()) {
            if (employee instanceof Consultant) {
                if (employee.isFree()) {
                    return (Consultant) employee;
                }
            }
        }

        return null;
    }
}
