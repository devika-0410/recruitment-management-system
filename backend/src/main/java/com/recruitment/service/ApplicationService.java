package com.recruitment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recruitment.entity.Application;
import com.recruitment.entity.ApplicationStatus;
import com.recruitment.repository.ApplicationRepository;

@Service
public class ApplicationService {

    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application createApplication(Application application) {
        return applicationRepository.save(application);
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    public Application updateStatus(Integer id, ApplicationStatus status) {

        Application application = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        application.setStatus(status);

        return applicationRepository.save(application);
    }
}