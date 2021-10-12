package com.example.fallmonitor.notification.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public record CaretakerId (Integer caretakerId) {

    @JsonValue
    public Integer getCaretakerId() {
        return caretakerId;
    }
}
