package com.example.Diplom.DTO.RESPONSE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookResponse {
    private Long id;
    private String authorName;
    private String bookName;
    private int pages;
    private Float cost;

}
