package com.mk.reactivesbapp.student;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

    Flux<Student> findByFirstName(String firstName);
    Flux<Student> findAllByFirstNameIgnoreCase(String firstName);

}
