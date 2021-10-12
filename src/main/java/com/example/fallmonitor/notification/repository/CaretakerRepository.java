package com.example.fallmonitor.notification.repository;

import com.example.fallmonitor.notification.domain.Caretaker;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CaretakerRepository extends CrudRepository<Caretaker, Integer> {
    @Query("SELECT CAREAKER_ID FROM CARETAKER WHERE PATIENT_ID=:patienId")
    Integer getIdByPatientId(@Param("patientId") Integer patientId);
    @Query("SELECT EMAIL FROM CARETAKER WHERE PATIENT_ID=:patientId")
    Optional<String> findEmailByPatientId(@Param("patientId") Integer patientId);
    @Query("SELECT PHONE_NUMBER FROM CARETAKER WHERE PATIENT_ID=:patientId")
    Optional<Integer> findPhoneNumberByPatientId(@Param("patientId") Integer patientId);

}
