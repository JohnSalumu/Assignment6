package com.john.factory.people;

import com.john.domain.People.User;
import com.john.factory.people.UserFactory;
import org.junit.Assert;

public class UserFactoryTest {
    public void getUser() {
        String userId = "DFGjk";
        String userTitle = "Doctor";


        User E = UserFactory.getUser(userId,userTitle);
        System.out.println(E);
        Assert.assertNotNull(UserFactory.getUser(userId,userTitle));
    }

}