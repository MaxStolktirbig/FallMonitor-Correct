package com.example.fallmonitor.notification.common;

import com.example.fallmonitor.notification.domain.PatientId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;


@ReadingConverter
public class PatientIdToIntConverter implements Converter<PatientId, Integer> {
    @Override
    public Integer convert(PatientId source) {
        return source.patientId();
    }
}
