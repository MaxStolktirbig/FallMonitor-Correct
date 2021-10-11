package com.example.fallmonitor.notification.repository;

import com.example.fallmonitor.notification.domain.Caretaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaretakerRepository extends CrudRepository<Caretaker, Integer> {}
