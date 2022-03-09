package com.example.Diplom.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

public class CandidateEnt {
    @Getter
    @Setter
    @NoArgsConstructor
    @Entity
    @Table(name =  "Сandidate")

    public class candidate{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String CandidateName;
        private String CandidateSurname;
        private String Email;
        private String password;
        @Transient
        private String passwordConfirm;
        @ManyToMany(fetch = FetchType.EAGER)
        private Set<CourseEnt.Course> course;
    }

    public CandidateEnt() {
    }


}

