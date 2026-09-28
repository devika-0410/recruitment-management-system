package com.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.entity.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Integer> {

}