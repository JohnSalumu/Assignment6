package com.john.domain;

public class User {

    private String userId, userTitle;


    private User() {
    }

    private User(User.Builder builder) {
        this.userId = builder.userId;

        this.userTitle = builder.userTitle;

    }

    public String userId() {
        return userId;
    }

    public String userTitle() {
        return userTitle;
    }





    public static class Builder {

        private String userId, userTitle;

        //private Set<Course> courses;

        public User.Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public User.Builder userTitle(String userTitle) {
            this.userTitle = userTitle;
            return this;
        }




        public com.john.domain.User build() {
            return new com.john.domain.User(this);
        }

    }



}
