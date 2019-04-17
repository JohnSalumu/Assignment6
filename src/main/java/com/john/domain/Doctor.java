package com.john.domain;

public class Doctor {

    private String doctorId, licenceNo;


    private Doctor(Builder builder) {
    }

    private Doctor (User.Builder builder) {
        //this.doctorId = builder.doctorId;

       // this.licenceNo = builder.licenceNo;

    }

    public String doctorId() {
        return doctorId;
    }

    public String licenceNo() {
        return licenceNo;
    }





    public static class Builder {

        private String doctorId, licenceNo;

        //private Set<Course> courses;

        public Doctor.Builder doctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Doctor.Builder licenceNo(String licenceNo) {
            this.licenceNo = licenceNo;
            return this;
        }




        public com.john.domain.Doctor build() {
            return new com.john.domain.Doctor(this);
        }

    }



}
