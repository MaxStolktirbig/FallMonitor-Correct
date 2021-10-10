package com.example.fallmonitor.notification.common;

import com.example.fallmonitor.notification.domain.CaretakerId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class CaretakerIdToIntConverter implements Converter<CaretakerId, Integer> {

    @Override
    public Integer convert(CaretakerId source) {
        return source.caretakerId();
    }
}


