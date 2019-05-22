package com.john.factory.admin;

import com.john.domain.Admin.Doctor;
import com.john.factory.admin.DoctorFactory;
import org.junit.Assert;
import org.junit.Test;

public class DoctorFactoryTest {

    @Test
    public void getDoctor() {
        String doctorId = "DOCTOR123";
        String licenseNo = "D25245";


        Doctor D = DoctorFactory.getDoctor(doctorId,licenseNo);
        System.out.println(D);
        Assert.assertNotNull(DoctorFactory.getDoctor(doctorId,licenseNo));
    }

}