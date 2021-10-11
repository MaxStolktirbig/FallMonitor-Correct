package com.example.fallmonitor.monitor.common;

import com.example.fallmonitor.monitor.domain.RecordedDataInstanceId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class IntToRecordedDataInstanceIdConverter implements Converter<Integer, RecordedDataInstanceId> {
    @Override
    public RecordedDataInstanceId convert(Integer source) {
        RecordedDataInstanceId recordedDataInstanceId = new RecordedDataInstanceId(source);
        return recordedDataInstanceId.recordedDataInstanceId() != 0 ? recordedDataInstanceId : null;
    }
}
