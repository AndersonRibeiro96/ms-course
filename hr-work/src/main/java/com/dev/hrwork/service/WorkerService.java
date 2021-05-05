package com.dev.hrwork.service;

import com.dev.hrwork.domain.Worker;
import com.dev.hrwork.repositories.WorkerRepository;
import com.dev.hrwork.web.errors.WorkerNotFoundException;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository workerRepository;


    public List<Worker> findAll(){
        return workerRepository.findAll();
    }

    public Worker findById(Long id){
        return workerRepository.findById(id).orElseThrow(() -> new WorkerNotFoundException("worker not found"));
    }



}
