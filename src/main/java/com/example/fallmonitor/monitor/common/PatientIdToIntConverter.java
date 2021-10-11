package com.example.fallmonitor.monitor.common;

import com.example.fallmonitor.monitor.domain.PatientId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;


@WritingConverter
public class PatientIdToIntConverter implements Converter<PatientId, Integer> {
    @Override
    public Integer convert(PatientId source) {
        return source.patientId();
    }
}
