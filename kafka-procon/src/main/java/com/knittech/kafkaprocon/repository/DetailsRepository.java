package com.knittech.kafkaprocon.repository;

import com.knittech.kafkaprocon.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
