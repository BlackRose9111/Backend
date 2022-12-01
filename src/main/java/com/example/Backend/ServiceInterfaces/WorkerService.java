package com.example.Backend.ServiceInterfaces;

import com.example.Backend.DTO.WorkerCreateDto;
import com.example.Backend.DTO.WorkerDto;
import org.springframework.stereotype.Service;

@Service
public interface WorkerService {

    public WorkerDto getWorkerById(long id);
    public WorkerDto createWorker(WorkerCreateDto dto);



}
