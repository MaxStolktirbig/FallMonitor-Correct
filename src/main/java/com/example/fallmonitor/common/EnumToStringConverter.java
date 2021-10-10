package com.example.fallmonitor.common;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public enum EnumToStringConverter implements Converter<Enum, String> {
    INSTANCE;

    @Override
    public String convert(Enum e) {
        return e.name();
    }
}
