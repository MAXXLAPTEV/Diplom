package com.example.Diplom.repo;

import com.example.Diplom.dto.resp.Payment;
import com.example.Diplom.entity.PaymentEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class PaymentRepo {

    public List<Payment> payments = new ArrayList<>();


    public List<Payment> getPayments(){return payments;}

    public void setPayment(List<Payment> payment){this.payments = payment;}

    public void addPayment(Payment payment){payments.add(payment);}

    public Payment getPayment(int PaymentId){
        for (int i = 0; i < payments.size(); i++) {
            if(payments.get(i).getPaymentId() == PaymentId){
                return payments.get(i);
            }
        }
        return null;
    }
}
