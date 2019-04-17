package com.john.factory;


import com.john.domain.Employee;
import com.john.util.Misc;

public class EmployeeFactory {

    public static Employee getEmployee(String firstName, String lastName, int age) {
        return new Employee.Builder().age(age)
                .employeeFirstname(firstName)
                .employeeLastname(lastName)
                .employeeId(Misc.generateId())
                .build();
    }
}

