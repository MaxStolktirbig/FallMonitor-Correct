package com.example.fallmonitor.monitor.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

@Data
public class RecordedDataInstance {
    @Id
    @Embedded.Nullable
    private RecordedDataInstanceId recordedDataInstanceId;
    @Embedded.Nullable
    private PatientId patientId;
    private float walkingSpeed;

    public RecordedDataInstance(RecordedDataInstanceId recordedDataInstanceId, PatientId patientId, float walkingSpeed) {
        this.recordedDataInstanceId = recordedDataInstanceId;
        this.patientId = patientId;
        this.walkingSpeed = walkingSpeed;
    }

    public static RecordedDataInstance create(PatientId patientId, float walkingSpeed){
        RecordedDataInstance recordedDataInstance = new RecordedDataInstance(null, patientId, walkingSpeed);
        if(validateData(walkingSpeed)){
            return recordedDataInstance;
        } else {
            return null;
        }
    }
    public static RecordedDataInstance create(int patientId, float walkingSpeed){
        RecordedDataInstance recordedDataInstance = new RecordedDataInstance(null, new PatientId(patientId), walkingSpeed);
        if(validateData(walkingSpeed)){
            return recordedDataInstance;
        } else {
            return null;
        }
    }

    public static boolean validateData(float walkingSpeed){
        return walkingSpeed < 10;
    }
}
