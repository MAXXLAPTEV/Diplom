package com.example.Diplom.service;

import com.example.Diplom.dto.resp.Candidate;
import com.example.Diplom.repo.CandidateRepo;
import com.example.Diplom.repo.CourseRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    private final CandidateRepo candidateRepo;
    private final CourseRepo courseRepo;
    private final ObjectMapper objectMapper;

    public CandidateService(CandidateRepo candidateRepo, CourseRepo courseRepo, ObjectMapper objectMapper) {
        this.candidateRepo = candidateRepo;
        this.courseRepo = courseRepo;
        this.objectMapper = objectMapper;
    }
    public void addCandidate(Candidate newCandidate){candidateRepo.addCandidate(new Candidate());}


    public Candidate getCan(int id){
        return candidateRepo.getCandidate(id);
    }
    public List<Candidate> getAllCandidates(){return candidateRepo.getCandidates();}

    public void deleteCandidate(int id){candidateRepo.deleteCandidate(id);}

    public Candidate findCandidateById(int id){
        Optional<Candidate> candidateFromDb = Optional.ofNullable(candidateRepo.getCandidate(id));
        return candidateFromDb.orElse(new Candidate() );
    }

//    public boolean saveCandidate(Candidate candidate){
//        Candidate candidate1 = candidateRepo.getCandidate(candidate.getId());
//
//        if (candidate1 != null){
//            return false;
//        }
//
//
//    }





}
