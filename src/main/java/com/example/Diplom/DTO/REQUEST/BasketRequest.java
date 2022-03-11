package com.example.Diplom.DTO.REQUEST;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasketRequest {
    private Long customerId;
    private Long productId;

}
