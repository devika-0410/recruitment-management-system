package com.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}