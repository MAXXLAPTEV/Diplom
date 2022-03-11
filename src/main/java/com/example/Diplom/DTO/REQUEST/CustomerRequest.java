package com.example.Diplom.DTO.REQUEST;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerRequest {

    private String name;
    private String surname;
    private String email;
}
