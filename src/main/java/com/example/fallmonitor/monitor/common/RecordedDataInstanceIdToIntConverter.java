package com.example.fallmonitor.monitor.common;

import com.example.fallmonitor.monitor.domain.RecordedDataInstanceId;
import com.example.fallmonitor.notification.domain.PatientId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;


@ReadingConverter
public class RecordedDataInstanceIdToIntConverter implements Converter<RecordedDataInstanceId, Integer> {
    @Override
    public Integer convert(RecordedDataInstanceId source) {
        return source.recordedDataInstanceId();
    }
}
