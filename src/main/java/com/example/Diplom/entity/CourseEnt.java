package com.example.Diplom.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Set;

public class CourseEnt {
    @Getter
    @Setter
    @Entity
    @Table(name = "Course")
    public class Course {
        @Id
        private Long CourseId;
        private String CourseName;
        @DateTimeFormat
        private int date;
        @Transient
        @ManyToMany(fetch = FetchType.EAGER)
        //@ManyToMany(mappedBy = "Course")
        private Set<CandidateEnt.candidate> candidate;

        public Course(String name, int date, Set<CandidateEnt.candidate> candidate) {
            this.CourseName = name;
            this.date = date;
            this.candidate = candidate;
        }
        public Course() {
        }

        public Long getCourseId() {
            return CourseId;
        }

        public void setCourseId(Long courseId) {
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

        public Set<CandidateEnt.candidate> getCandidate() {
            return candidate;
        }

        public void setCandidate(Set<CandidateEnt.candidate> candidate) {
            this.candidate = candidate;
        }

        public Course(Long courseId, String courseName, int date, Set<CandidateEnt.candidate> candidate) {
            CourseId = courseId;
            CourseName = courseName;
            this.date = date;
            this.candidate = candidate;
        }
    }
}
