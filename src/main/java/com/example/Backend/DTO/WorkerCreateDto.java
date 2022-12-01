package com.example.Backend.DTO;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.Backend.Model.Worker} entity
 */
@Data
public class WorkerCreateDto implements Serializable {
    private final String name;
    private final String surname;
    private final Long companyId;
}