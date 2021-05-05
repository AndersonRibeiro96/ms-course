package com.dev.hrpayroll.services;

import com.dev.hrpayroll.domain.Payment;
import com.dev.hrpayroll.domain.Worker;
import com.dev.hrpayroll.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getNome(), worker.getDailyIncome(), days);
    }





}
