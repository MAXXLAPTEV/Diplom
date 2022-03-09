package com.example.Diplom.service;

import com.example.Diplom.dto.resp.Payment;
import com.example.Diplom.repo.CourseRepo;
import com.example.Diplom.repo.PaymentRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service

public class PaymentService {
    private final PaymentRepo paymentRepo;
    private final CourseRepo courseRepo;
    private final ObjectMapper objectMapper;

    public PaymentService(PaymentRepo paymentRepo, CourseRepo courseRepo, ObjectMapper objectMapper) {
        this.paymentRepo = paymentRepo;
        this.courseRepo = courseRepo;
        this.objectMapper = objectMapper;
    }

  public void addPayment(Payment newPayment){paymentRepo.addPayment(newPayment);}

  public Payment getPayment(int PaymentId){return paymentRepo.getPayment(PaymentId);}





}
