package com.example.fallmonitor.monitor.repository;

import com.example.fallmonitor.monitor.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Integer > {}
