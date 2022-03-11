package com.example.Diplom.DTO.REQUEST;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookRequest {
    private String authorName;
    private String bookName;
    private int pages;
    private Float cost;
}
