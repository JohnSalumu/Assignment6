package com.john.factory.people;


import com.john.domain.People.Employee;
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

