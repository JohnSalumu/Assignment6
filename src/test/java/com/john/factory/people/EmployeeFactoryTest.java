package com.john.factory.people;

import com.john.domain.People.Employee;
import com.john.factory.people.EmployeeFactory;
import org.junit.Assert;

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