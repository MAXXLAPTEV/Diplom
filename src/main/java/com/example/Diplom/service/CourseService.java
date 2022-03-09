package com.example.Diplom.service;


import com.example.Diplom.dto.resp.Course;
import com.example.Diplom.repo.CandidateRepo;
import com.example.Diplom.repo.CourseRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepo courseRepo;
    private final CandidateRepo candidateRepo;
    private final ObjectMapper objectMapper;

    public CourseService(CourseRepo courseRepo, CandidateRepo candidateRepo, ObjectMapper objectMapper) {
        this.courseRepo = courseRepo;
        this.candidateRepo = candidateRepo;
        this.objectMapper = objectMapper;
    }

    public void addCourse(Course newCourse){courseRepo.addCourse(newCourse);}

    public Course getCourse(int CourseId){return courseRepo.getCourse(CourseId);}

    public List<Course> getAllCourses(){return courseRepo.getCourses();}


}
