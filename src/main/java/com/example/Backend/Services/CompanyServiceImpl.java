package com.example.Backend.Services;

import com.example.Backend.DTO.CompanyCreateDto;
import com.example.Backend.DTO.CompanyDto;
import com.example.Backend.Exceptions.NotFoundException;
import com.example.Backend.Model.Company;
import com.example.Backend.Repos.CompanyRepository;
import com.example.Backend.ServiceInterfaces.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;
    @Override
    public CompanyDto getCompanyById(Long id) {

        companyRepository.findById(id);
        System.out.println("ID IS MY ASS ----->"+id);
        Company company = companyRepository.findById(id).orElseThrow(NotFoundException::new);
        return CompanyDto.companyToDto(company);
    }

    @Override
    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    @Override
    public CompanyDto createCompany(CompanyCreateDto dto) {
        Company cmp = companyRepository.save(new Company(dto.getName(),dto.getAddress(),dto.getZipcode()));
        return CompanyDto.companyToDto(cmp);
    }
}
