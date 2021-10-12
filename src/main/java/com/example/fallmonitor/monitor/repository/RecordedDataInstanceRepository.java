package com.example.fallmonitor.monitor.repository;

import com.example.fallmonitor.monitor.domain.RecordedDataInstance;
import com.example.fallmonitor.monitor.domain.RecordedDataInstanceId;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecordedDataInstanceRepository extends CrudRepository<RecordedDataInstance, Integer> {


    @Query("SELECT * FROM recorded_data_instance WHERE patient_id = :patientId")
    List<RecordedDataInstance> findAllByPatientId(@Param("patientId") Integer patientId);

    @Query("SELECT recorded_data_instance_id FROM recorded_data_instance WHERE patient_id = :patientId")
    List<RecordedDataInstanceId> findIdsByPatientId(@Param("patientId") Integer patientId);
}
