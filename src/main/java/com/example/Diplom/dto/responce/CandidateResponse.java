package com.example.Diplom.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class
CandidateResponse {
    private Long id;
    private String CandidateName;
    private String CandidateSurname;
    private String Email;
    private String password;

}
