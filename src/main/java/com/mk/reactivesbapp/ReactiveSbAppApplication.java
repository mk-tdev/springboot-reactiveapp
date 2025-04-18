package com.mk.reactivesbapp;

import com.mk.reactivesbapp.student.Student;
import com.mk.reactivesbapp.student.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveSbAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactiveSbAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentService studentService) {
        return args -> {
//            for (int i = 0; i < 100; i++) {
//                studentService.save(
//                        Student.builder()
//                                .firstName("John" + i)
//                                .lastName("Doe" + i)
//                                .age(30 + i)
//                                .build()
//
//                ).subscribe();
//            }
        };
    }
}
