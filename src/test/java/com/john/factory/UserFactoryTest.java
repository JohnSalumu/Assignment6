package com.john.factory;

import com.john.domain.Employee;
import com.john.domain.User;
import org.junit.Assert;

import static org.junit.Assert.*;

public class UserFactoryTest {
    public void getUser() {
        String userId = "DFGjk";
        String userTitle = "Doctor";


        User E = UserFactory.getUser(userId,userTitle);
        System.out.println(E);
        Assert.assertNotNull(UserFactory.getUser(userId,userTitle));
    }

}