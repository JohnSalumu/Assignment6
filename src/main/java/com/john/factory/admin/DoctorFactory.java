package com.john.factory.admin;


import com.john.domain.Admin.Doctor;

public class DoctorFactory {

    public static Doctor getDoctor(String doctorId, String licenceNo) {
        return new Doctor.Builder()
                .doctorId(doctorId)
                .licenceNo(licenceNo)
                //.doctorId(Misc.generateId())
                .build();
    }



}
