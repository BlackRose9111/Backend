package com.example.Backend.ServiceInterfaces;

import com.example.Backend.DTO.CompanyCreateDto;
import com.example.Backend.DTO.CompanyDto;
import com.example.Backend.Model.Company;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public interface CompanyService {

    CompanyDto getCompanyById(Long id);

    List<Company> getAll();

    CompanyDto createCompany(CompanyCreateDto dto);
}
