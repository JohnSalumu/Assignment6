package com.john.repository.admin;

import com.john.domain.Admin.Doctor;

import java.util.HashSet;
import java.util.Set;

public class DoctorRepositoryImpl implements DoctorRepository {

    private static DoctorRepositoryImpl repository = null;
    private Set<Doctor> doctors;

    private DoctorRepositoryImpl(){
        this.doctors = new HashSet<>();
    }

    private Doctor findDoctor(final String doctorId) {
        return this.doctors.stream()
                .filter(doctor -> Doctor.getDoctorId().trim().equals(doctorId))
                .findAny()
                .orElse(null);
    }

    public static DoctorRepositoryImpl getRepository(){
        if (repository == null) repository = new DoctorRepositoryImpl();
        return repository;
    }


    public Doctor create(Doctor doctor){
        this.doctors.add(doctor);
        return doctor;
    }

    public Doctor read(final String doctorId){
        Doctor doctor = findDoctor(doctorId);
        return doctor;
    }

    public void delete(String doctorId) {
        Doctor doctor = findDoctor(doctorId);
        if (doctor != null) this.doctors.remove(doctor);
    }

    public Doctor update(Doctor doctor){
        Doctor toDelete = findDoctor(doctor.getDoctorId());
        if(toDelete != null) {
            this.doctors.remove(toDelete);
            return create(doctor);
        }
        return null;
    }


    public Set<Doctor> getAll(){
        return this.doctors;
    }

}
