package com.example.fallmonitor.monitor.domain;

public record RecordedDataInstanceId (Integer recordedDataInstanceId) {
    @Override
    public String toString() {
        return "RecordedDataInstanceId{" +
                "recordedDataInstanceId=" + recordedDataInstanceId +
                '}';
    }
}
