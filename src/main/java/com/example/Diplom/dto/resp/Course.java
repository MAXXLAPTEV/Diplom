package com.example.Diplom.dto.resp;


public class Course {


    public Course(int CourseId, String CourseName, int date){
        this.CourseId = CourseId;
        this.CourseName = CourseName;
        this.date = date;

    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    private int CourseId;
    private String CourseName;
    private int date;


}
