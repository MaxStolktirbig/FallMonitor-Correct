package com.example.fallmonitor;

import com.example.fallmonitor.monitor.domain.Patient;
import com.example.fallmonitor.monitor.repository.PatientRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FallMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(FallMonitorApplication.class, args);
    }

//    @Bean
//    ApplicationRunner applicationRunner(PatientRepository patientRepository){
//        return args -> {
//            System.out.println(patientRepository.findById(0).orElse(null));
//            System.out.println(patientRepository.findAll());
//        };
//    }
}
