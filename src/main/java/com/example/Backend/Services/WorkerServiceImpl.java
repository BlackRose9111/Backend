package com.example.Backend.Services;


import com.example.Backend.DTO.WorkerCreateDto;
import com.example.Backend.DTO.WorkerDto;
import com.example.Backend.Exceptions.NotFoundException;
import com.example.Backend.Model.Company;
import com.example.Backend.Model.Worker;
import com.example.Backend.Repos.CompanyRepository;
import com.example.Backend.Repos.WorkerRepository;
import com.example.Backend.ServiceInterfaces.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class WorkerServiceImpl implements WorkerService {
    private WorkerRepository workerRepository;
    private CompanyRepository companyRepository;
    @Override
    public WorkerDto getWorkerById(long id) {

        Worker worker = workerRepository.findById(id).orElseThrow(NotFoundException::new);

        return new WorkerDto(worker);

    }

    @Override
    public WorkerDto createWorker(WorkerCreateDto dto) {

        Company company = companyRepository.findById(dto.getCompanyId()).orElseThrow(NotFoundException::new);

        Worker worker = new Worker(dto.getName(), dto.getSurname(), company);

        workerRepository.save(worker);

        return new WorkerDto(worker);



    }


}
