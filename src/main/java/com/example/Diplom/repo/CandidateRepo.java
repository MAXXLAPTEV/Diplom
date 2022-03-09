package com.example.Diplom.repo;

import com.example.Diplom.dto.resp.Candidate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CandidateRepo  {

    public List<Candidate> candidates = new ArrayList<>();

    public List<Candidate> getCandidates(){return candidates;}

    public void setCandidate(List<Candidate> candidate){this.candidates = candidate;}


    public void addCandidate(Candidate candidate) {candidates.add(candidate);
    }

    public Candidate getCandidate(int id) {
        for (int i = 0; i < candidates.size(); i++) {
        if (candidates.get(i).getId() == id) {
            return candidates.get(i);
        }
    }
        return null;

    }

    public void deleteCandidate(int id){this.candidates.remove(id);}


}
