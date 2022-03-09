package com.example.Diplom.controllers;

import com.example.Diplom.dto.resp.Course;
import com.example.Diplom.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/course")

public class CourseController {

   final CourseService courseService;


    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/{CourseId}")
    public ResponseEntity<Course> getCourseId(@PathVariable int CourseId){
        return ResponseEntity.ok().body(courseService.getCourse(CourseId));
    }
    @PostMapping("/addCourse")
    public void addCourse(@RequestBody Course newCourse){courseService.addCourse(newCourse);}

}
