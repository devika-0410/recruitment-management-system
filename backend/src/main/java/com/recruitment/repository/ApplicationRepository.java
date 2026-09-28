package com.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}