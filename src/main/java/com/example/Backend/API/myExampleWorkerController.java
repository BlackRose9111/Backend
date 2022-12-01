package com.example.Backend.API;

import com.example.Backend.DTO.WorkerCreateDto;
import com.example.Backend.DTO.WorkerDto;
import com.example.Backend.Services.WorkerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/worker")
@RequiredArgsConstructor
public class myExampleWorkerController {
    private final WorkerServiceImpl workerService;

    @GetMapping("/{id}")
    public ResponseEntity<WorkerDto> getWorker(@PathVariable long id){


        return ResponseEntity.ok(workerService.getWorkerById(id));

    }
    @PostMapping("/create")
    public ResponseEntity<?> createWorker(@RequestBody WorkerCreateDto dto){

        return  ResponseEntity.ok(workerService.createWorker(dto));

    }




}
