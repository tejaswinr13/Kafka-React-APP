package com.knittech.kafkaprocon.service;

import com.knittech.kafkaprocon.model.Details;

import java.util.List;

public interface DetailsService {

    Details save (Details details);

    List<Details> getAll();
}
