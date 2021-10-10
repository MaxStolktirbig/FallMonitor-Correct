package com.example.fallmonitor.notification.common;

import com.example.fallmonitor.notification.domain.CaretakerId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;


@ReadingConverter
public class IntToCaretakerIdConverter implements Converter<Integer, CaretakerId> {
    @Override
    public CaretakerId convert(Integer source) {
        CaretakerId caretakerId = new CaretakerId(source);
        return caretakerId.caretakerId() != 0 ? caretakerId : null;
    }
}
