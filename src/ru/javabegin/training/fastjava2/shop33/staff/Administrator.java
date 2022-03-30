package ru.javabegin.training.fastjava2.shop33.staff;

import ru.javabegin.training.fastjava2.shop33.SalesRoom;
import ru.javabegin.training.fastjava2.shop33.interfaces.DepartmentInterfaces;
import ru.javabegin.training.fastjava2.shop33.interfaces.StaffInterface;

public class Administrator {

    private SalesRoom salesRoom;

    public Administrator(SalesRoom salesRoom) {
        this.salesRoom = salesRoom;
    }

    public Consultant getFreeConsultant(DepartmentInterfaces departmentInterfaces) {

        for (StaffInterface staff : departmentInterfaces.getEmployeeList()) {
            if (staff instanceof Consultant) {
                if (staff.isFree()) {
                    return (Consultant) staff;
                }
            }

        }
        return null;
    }
}