package com.john.repository;

import com.john.domain.Admin.Doctor;
import com.john.factory.admin.DoctorFactory;
import com.john.repository.admin.DoctorRepository;
import com.john.repository.admin.DoctorRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoctorRepositoryImplTest {

    private DoctorRepository repository;
    private Doctor doctor;

    private Doctor getSavedCourse() {
        Set<Doctor> savedDoctors = this.repository.getAll();
        return savedDoctors.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = DoctorRepositoryImpl.getRepository();


        this.doctor = DoctorFactory.buildDoctor("Test Doctor");
    }

    @Test
    public void a_create() {
        Doctor created = this.repository.create(this.doctor);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.doctor);
    }

    @Test
    public void b_read() {
        Doctor savedDoctor = getSavedDoctor();
        System.out.println("In read, doctorId = " + savedDoctor.getDoctorId());
        Doctor read = this.repository.read(savedDoctor.getDoctorId());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedDoctor, read);
    }

    @Test
    public void e_delete() {
        Doctor savedDoctor = getSavedDoctor();
        this.repository.delete(savedDoctor.getDoctorId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String doctorId = "New Test Doctor Id";
        Doctor doctor = new Doctor.Builder().copy(getSavedDoctor()).doctorId(doctorId).build();
        System.out.println("In update, about_to_updated = " + doctor);
        Doctor updated = this.repository.update(doctor);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(doctorId, updated.getDoctorId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Doctor> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }


}
