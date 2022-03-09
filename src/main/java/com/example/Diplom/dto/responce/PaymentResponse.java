package com.example.Diplom.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PaymentResponse {

    private Long PaymentId;
    private int price;
    private String PaymentName;
}
