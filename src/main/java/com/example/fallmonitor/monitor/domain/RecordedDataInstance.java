package com.example.fallmonitor.monitor.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

@Data
public class RecordedDataInstance {
    @Id @Embedded.Nullable
    private RecordedDataInstanceId recordedDataInstanceId;
    private float walkingSpeed;
}
