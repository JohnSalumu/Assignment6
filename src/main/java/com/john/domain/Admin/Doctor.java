package com.john.domain.Admin;

import com.john.domain.People.User;

public class Doctor {

    private String doctorId, licenceNo;


    private Doctor(Builder builder) {
    }

    private Doctor (User.Builder builder) {
        //this.doctorId = builder.doctorId;

       // this.licenceNo = builder.licenceNo;

    }

    public static String getDoctorId() {
        return getDoctorId();
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




        public Doctor build() {
            return new Doctor(this);
        }

    }



}
