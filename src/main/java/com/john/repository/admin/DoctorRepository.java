package com.john.repository.admin;

import com.john.domain.Admin.Doctor;
import com.john.repository.IRepository;

import java.util.Set;

public interface DoctorRepository extends IRepository<Doctor, String> {
    Set<Doctor> getAll();
}
