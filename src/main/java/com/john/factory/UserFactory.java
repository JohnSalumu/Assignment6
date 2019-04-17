package com.john.factory;

import com.john.domain.Employee;
import com.john.util.Misc;


    import com.john.domain.User;
import com.john.util.Misc;

    public class UserFactory {

        public static User getUser(String userId, String userTitle) {
            return new User.Builder()

                    .userTitle(userTitle)
                    .userId(Misc.generateId())
                    .build();
        }
}
