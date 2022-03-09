package com.example.Diplom.controllers;

import com.example.Diplom.dto.resp.Candidate;
import com.example.Diplom.service.CandidateService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")

public class CandidateController {

  final CandidateService candidateService;

  public CandidateController(CandidateService candidateService) {
    this.candidateService = candidateService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Candidate> getCanId(@PathVariable int id){
    return ResponseEntity.ok().body(candidateService.getCan(id));
  }
  @PostMapping("/addCandidate")
  public void addCandidat(@RequestBody Candidate newCandidate){candidateService.addCandidate(newCandidate);}

  @GetMapping("/getAllCandidates")
  public List<Candidate> getAllCandidates(){
    return candidateService.getAllCandidates();
  }

  @DeleteMapping("/deleteCandidate")
  public void deleteCandidate(@PathVariable int id){candidateService.deleteCandidate(id);}
}


