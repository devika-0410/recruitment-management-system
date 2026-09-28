package com.recruitment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recruitment.entity.Candidate;
import com.recruitment.repository.CandidateRepository;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate createCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }
}