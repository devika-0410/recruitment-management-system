package com.recruitment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recruitment.entity.Interview;
import com.recruitment.repository.InterviewRepository;

@Service
public class InterviewService {

    private final InterviewRepository interviewRepository;

    public InterviewService(InterviewRepository interviewRepository) {
        this.interviewRepository = interviewRepository;
    }

    public Interview createInterview(Interview interview) {
        return interviewRepository.save(interview);
    }

    public List<Interview> getAllInterviews() {
        return interviewRepository.findAll();
    }
}