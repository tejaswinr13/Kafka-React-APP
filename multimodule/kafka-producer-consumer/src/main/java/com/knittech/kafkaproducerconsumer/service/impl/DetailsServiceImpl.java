package com.knittech.kafkaproducerconsumer.service.impl;

import com.knittech.kafkaproducerconsumer.model.Details;
import com.knittech.kafkaproducerconsumer.repository.DetailsRepository;
import com.knittech.kafkaproducerconsumer.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DetailsServiceImpl implements DetailsService {

    @Autowired
    private DetailsRepository detailsRepository;

    @Override
    public Details save(Details details) {
        return detailsRepository.save(details);
    }

    @Override
    public List<Details> getAll() {
        return detailsRepository.findAll();
    }
}
