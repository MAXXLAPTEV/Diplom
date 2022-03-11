//package com.example.Diploma.controllers;
//
//import com.example.Diploma.dto.resp.Candidate;
//import com.example.Diploma.repo.CandidateRepo;
//import com.example.Diploma.repo.CourseRepo;
//import com.example.Diploma.repo.PaymentRepo;
//import com.example.Diploma.service.CandidateService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import static org.mockito.Mockito.verify;
//
//@DataJpaTest
//class CandidateControllerTest {
////
////    @Mock
////    private CandidateService underTest;
////    private CandidateRepo;
////    private CourseRepo;
////    private ObjectMapper;
////    private PaymentRepo;
////    private AutoCloseable;
////
////    @BeforeEach
////    void setUp() {
////        autoCloseable = MockitoAnnotations.openMocks(this);
////        underTest = new CandidateService(candidateRepo, courseRepo, objectMapper, paymentRepo);
////    }
////
////    @AfterEach
////    void tearDown() throws Exception {
////        autoCloseable.close();
////    }
////
////    @Test
////    void GetCanId() {
////        underTest.getCan(1);
////        verify(candidateRepo).getCandidate(1);
////            }
////
////    @Test
////    void addCandidate() {
////    }
////
////    @Test
////    void getAllCandidates() {
////    }
////
////    @Test
////    void deleteCandidate() {
////    }
//}