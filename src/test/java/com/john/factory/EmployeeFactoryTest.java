package com.john.factory;

import com.john.domain.Employee;
import org.junit.Assert;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    public void getEmployee() {
        String firstName = "John";
        String lastName = "Salumu";
        int age = 22;

        Employee E = EmployeeFactory.getEmployee(firstName,lastName,age);
        System.out.println(E);
        Assert.assertNotNull(EmployeeFactory.getEmployee(firstName,lastName,age));
    }

}