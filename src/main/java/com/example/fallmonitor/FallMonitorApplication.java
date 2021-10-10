package com.example.fallmonitor;

import com.example.fallmonitor.monitor.repository.PatientRepository;
import com.example.fallmonitor.notification.domain.Caretaker;
import com.example.fallmonitor.notification.repository.CaretakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FallMonitorApplication {

    @Autowired
    CaretakerRepository caretakerRepository;
    @Autowired
    PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(FallMonitorApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(){
        return args -> {
            Caretaker caretaker = Caretaker.create("henk", "janstraat 123", "henk@henk1.nl", 635462576);
            caretakerRepository.save(caretaker);
            System.out.println(caretakerRepository.findAll());
            System.out.println(patientRepository.findAll());
        };
    }
}
