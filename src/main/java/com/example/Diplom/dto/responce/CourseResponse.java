package com.example.Diplom.dto.responce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CourseResponse {
    private Long CourseId;
    private String CourseName;
    private int date;

}
