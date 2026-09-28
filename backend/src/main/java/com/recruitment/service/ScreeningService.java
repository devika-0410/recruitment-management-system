package com.recruitment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recruitment.entity.Screening;
import com.recruitment.repository.ScreeningRepository;

@Service
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }

    public Screening createScreening(Screening screening) {
        return screeningRepository.save(screening);
    }

    public List<Screening> getAllScreenings() {
        return screeningRepository.findAll();
    }
}