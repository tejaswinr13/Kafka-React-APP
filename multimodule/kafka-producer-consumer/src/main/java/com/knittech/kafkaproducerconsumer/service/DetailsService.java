package com.knittech.kafkaproducerconsumer.service;

import com.knittech.kafkaproducerconsumer.model.Details;

import java.util.List;

public interface DetailsService {

    Details save(Details details);

    List<Details> getAll();
}
