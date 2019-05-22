package com.john.factory.people;

import com.john.util.Misc;


    import com.john.domain.People.User;

public class UserFactory {

        public static User getUser(String userId, String userTitle) {
            return new User.Builder()

                    .userTitle(userTitle)
                    .userId(Misc.generateId())
                    .build();
        }
}
