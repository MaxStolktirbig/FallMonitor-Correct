package com.example.fallmonitor.common;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public enum StringToEnumFactory implements ConverterFactory<String, Enum> {
    INSTANCE;
    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> aClass) {
        return new StringToEnum<T>(aClass);
    }

    @RequiredArgsConstructor
    private static class StringToEnum<T extends Enum> implements Converter<String, T> {
        private final Class<T> enumType;

        @Override
        public T convert(String s) {
            return s == null ? null : (T) Enum.valueOf(enumType, s);
        }
    }
}
