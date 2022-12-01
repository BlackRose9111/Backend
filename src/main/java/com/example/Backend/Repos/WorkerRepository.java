package com.example.Backend.Repos;

import com.example.Backend.Model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {


}