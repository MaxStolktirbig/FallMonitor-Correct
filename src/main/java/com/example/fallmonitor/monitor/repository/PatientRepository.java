package com.example.fallmonitor.monitor.repository;

import com.example.fallmonitor.monitor.domain.Patient;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer > {
    @Override
    @Query("SELECT * FROM PATIENT WHERE PATIENT_ID=:patientId")
    Optional<Patient> findById(Integer patientId);
    @Query("SELECT PHONE_NUMBER FROM PATIENT WHERE PATIENT_ID=:patientId")
    Optional<Integer> findPhoneNumberByPatientId(@Param("patientId") Integer patientId);

}
