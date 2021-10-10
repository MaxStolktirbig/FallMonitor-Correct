package com.example.fallmonitor.monitor.common;

import com.example.fallmonitor.monitor.domain.PatientId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;


@ReadingConverter
public class IntToPatientIdConverter implements Converter<Integer, PatientId> {
    @Override
    public PatientId convert(Integer source) {
        PatientId patientId = new PatientId(source);
        return patientId.patientId() != 0 ? patientId : null;
    }
}
