package com.recruitment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.entity.Offer;

public interface OfferRepository extends JpaRepository<Offer, Integer> {

}