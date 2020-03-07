package com.knittech.kafkaproducerconsumer.repository;

import com.knittech.kafkaproducerconsumer.model.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details, Integer> {
}
