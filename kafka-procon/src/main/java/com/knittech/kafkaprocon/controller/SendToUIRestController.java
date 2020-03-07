package com.knittech.kafkaprocon.controller;

import com.knittech.kafkaprocon.model.Details;
import com.knittech.kafkaprocon.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ui")
@CrossOrigin(origins = "http://localhost:8081")
public class SendToUIRestController {

    @Autowired
    private DetailsService detailsService;

    @GetMapping("/details")
    public List<Details> getAllDetails (){
        return detailsService.getAll();
    }
}
