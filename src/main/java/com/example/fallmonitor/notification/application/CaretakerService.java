package com.example.fallmonitor.notification.application;

import com.example.fallmonitor.notification.domain.ContactInfo;
import com.example.fallmonitor.notification.repository.CaretakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CaretakerService {
    @Autowired
    CaretakerRepository caretakerRepository;

    public ContactInfo getContactInfoByPatientId(int patientId) {
        return new ContactInfo(caretakerRepository.findEmailByPatientId(patientId),
                                caretakerRepository.findPhoneNumberByPatientId(patientId));
    }
}
