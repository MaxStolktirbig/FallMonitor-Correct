package com.example.fallmonitor.monitor.repository;

import com.example.fallmonitor.monitor.domain.RecordedPatientData;
import org.springframework.data.repository.CrudRepository;

public interface RecordedPatientDataRepository extends CrudRepository<RecordedPatientData, Integer> {}
