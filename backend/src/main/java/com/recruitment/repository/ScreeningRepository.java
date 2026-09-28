package com.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.entity.Screening;

public interface ScreeningRepository extends JpaRepository<Screening, Integer> {

}