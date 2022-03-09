package com.example.Diplom.repo;

import com.example.Diplom.dto.resp.Course;
import com.example.Diplom.entity.CourseEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CourseRepo  {
   public List<Course> courses  = new ArrayList<>();

   public List<Course> getCourses(){return courses;}

    public void setCourse(List<Course> course){this.courses = courses;}

    public Course getCourse(int CourseId){
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == CourseId ){
                return courses.get(i);
            }
        }
        return null;
    }

    public void addCourse(Course course){courses.add(course);}

}
