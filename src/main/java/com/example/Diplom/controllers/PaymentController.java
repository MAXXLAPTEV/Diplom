package com.example.Diplom.controllers;

import com.example.Diplom.dto.resp.Payment;
import com.example.Diplom.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")

public class PaymentController {
    final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/{PaymentId}")
    public ResponseEntity<Payment> getPaymentByID(@PathVariable int PaymentId){
        return ResponseEntity.ok().body(paymentService.getPayment(PaymentId));
    }
    @PostMapping("/addPayment")
    public void addPayment(@RequestBody Payment newPayment){paymentService.addPayment(newPayment);}
}
