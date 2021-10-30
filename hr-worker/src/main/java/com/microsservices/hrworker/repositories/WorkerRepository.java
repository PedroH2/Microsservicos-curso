package com.microsservices.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservices.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
