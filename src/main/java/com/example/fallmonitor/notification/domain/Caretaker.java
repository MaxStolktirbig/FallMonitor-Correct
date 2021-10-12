package com.example.fallmonitor.notification.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

@Data
public class Caretaker {
    @Id
    @Embedded.Nullable
    CaretakerId caretakerId;
    String name;
    String address;
    String email;
    @Embedded.Nullable
    PatientId patientId;
    int phoneNumber;

    public static Caretaker create(String name, String address, String email, int phoneNumber){
        Caretaker caretaker = new Caretaker();
        caretaker.setName(name);
        caretaker.setAddress(address);
        caretaker.setEmail(email);
        caretaker.setPhoneNumber(phoneNumber);
        return caretaker;
    }
    public int getId(){
        return caretakerId.caretakerId();
    }
}
