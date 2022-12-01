package com.example.Backend.DTO;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.Backend.Model.Company} entity
 */
@Data
public class CompanyCreateDto implements Serializable {
    private final String name;
    private final String address;
    private final String zipcode;
}