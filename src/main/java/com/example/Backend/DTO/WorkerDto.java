package com.example.Backend.DTO;

import com.example.Backend.Model.Worker;
import com.example.Backend.Repos.WorkerRepository;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.Backend.Model.Worker} entity
 */
@Data
public class WorkerDto implements Serializable {
    private final String name;
    private final String surname;
    private final CompanyDto company;

    public WorkerDto(Worker worker){

        this.name = worker.getName();
        this.surname = worker.getSurname();
        this.company = CompanyDto.companyToDto(worker.getCompany());



    }
}