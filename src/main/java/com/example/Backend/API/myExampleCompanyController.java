package com.example.Backend.API;

import com.example.Backend.DTO.CompanyCreateDto;
import com.example.Backend.DTO.CompanyDto;
import com.example.Backend.Model.Company;
import com.example.Backend.Services.CompanyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class myExampleCompanyController {
    private final CompanyServiceImpl companyService;

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable Long id){

    final CompanyDto dto = companyService.getCompanyById(id);
    return ResponseEntity.ok(dto);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAllCompanies(){

        List<Company> cmd = companyService.getAll();
        return ResponseEntity.ok(cmd);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCompany(@RequestBody CompanyCreateDto dto){


    return ResponseEntity.ok(companyService.createCompany(dto));

    }



}
