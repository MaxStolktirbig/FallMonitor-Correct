package com.example.fallmonitor.monitor.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public record RecordedDataInstanceId (Integer recordedDataInstanceId) {

    @JsonValue
    Integer getRecordedDataInstanceId(){
        return recordedDataInstanceId;
    }
}
