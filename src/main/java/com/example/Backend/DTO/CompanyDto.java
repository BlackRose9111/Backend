package com.example.Backend.DTO;

import com.example.Backend.Model.Company;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link com.example.Backend.Model.Company} entity
 */
@Data
public class CompanyDto implements Serializable {
    private final String name;
    private final String address;
    private CompanyDto(String name,String address){
        this.name = name;
        this.address = address;
    }
    public static CompanyDto companyToDto(Company company){

        return new CompanyDto(company.getName(),company.getAddress());


    }
}