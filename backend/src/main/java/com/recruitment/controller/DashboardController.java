package com.recruitment.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recruitment.repository.ApplicationRepository;
import com.recruitment.repository.CandidateRepository;
import com.recruitment.repository.InterviewRepository;
import com.recruitment.repository.JobRepository;
import com.recruitment.repository.OfferRepository;
import com.recruitment.repository.ScreeningRepository;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final JobRepository jobRepository;
    private final CandidateRepository candidateRepository;
    private final ApplicationRepository applicationRepository;
    private final ScreeningRepository screeningRepository;
    private final InterviewRepository interviewRepository;
    private final OfferRepository offerRepository;

    public DashboardController(
            JobRepository jobRepository,
            CandidateRepository candidateRepository,
            ApplicationRepository applicationRepository,
            ScreeningRepository screeningRepository,
            InterviewRepository interviewRepository,
            OfferRepository offerRepository) {

        this.jobRepository = jobRepository;
        this.candidateRepository = candidateRepository;
        this.applicationRepository = applicationRepository;
        this.screeningRepository = screeningRepository;
        this.interviewRepository = interviewRepository;
        this.offerRepository = offerRepository;
    }

    @GetMapping
    public Map<String, Long> getDashboard() {

        Map<String, Long> dashboard = new HashMap<>();

        dashboard.put("totalJobs", jobRepository.count());
        dashboard.put("totalCandidates", candidateRepository.count());
        dashboard.put("totalApplications", applicationRepository.count());
        dashboard.put("totalScreenings", screeningRepository.count());
        dashboard.put("totalInterviews", interviewRepository.count());
        dashboard.put("totalOffers", offerRepository.count());

        return dashboard;
    }
}