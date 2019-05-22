package com.john.domain.People;

public class Employee {
    private String employeeId, employeeFirstname, employeeLastname;
    private int age;

    private Employee() {
    }

    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.age = builder.age;
        this.employeeFirstname = builder.employeeFirstname;
        this.employeeLastname = builder.employeeLastname;
    }

    public String employeeId() {
        return employeeId;
    }

    public String employeeFirstname() {
        return employeeFirstname;
    }

    public String employeeLastname() {
        return employeeLastname;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String employeeId, employeeFirstname, employeeLastname;
        private int age;
        //private Set<Course> courses;

        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder employeeFirstname(String employeeFirstname) {
            this.employeeFirstname = employeeFirstname;
            return this;
        }

        public Builder employeeLastname(String employeeLastname) {
            this.employeeLastname = employeeLastname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + employeeId + '\'' +
                ", StudentFirstName='" + employeeFirstname + '\'' +
                ", StudentLastName='" + employeeLastname + '\'' +
                ", age=" + age +
                '}';
    }

}