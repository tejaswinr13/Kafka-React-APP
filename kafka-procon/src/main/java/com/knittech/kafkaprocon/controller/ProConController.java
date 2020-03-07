package com.knittech.kafkaprocon.controller;


import com.knittech.kafkaprocon.model.FinancialDetails;
import com.knittech.kafkaprocon.model.PersonalDetails;
import com.knittech.kafkaprocon.service.ReceiverService;
import com.knittech.kafkaprocon.service.SenderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class ProConController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private SenderService senderService;

    @PostMapping(value = "/sendp")
    public PersonalDetails send(@RequestBody PersonalDetails personalDetails){
        logger.info("Sending To Broker \t" + personalDetails.toString());
        senderService.sendPersonalDetails(personalDetails);
        return personalDetails;
    }

    @PostMapping(value = "/sendf")
    public FinancialDetails sendFinancialDetails (@RequestBody FinancialDetails financialDetails){
        logger.info("Sending To Broker \t" + financialDetails.toString());
        senderService.sendFinancialDetails(financialDetails);
        return financialDetails;
    }
}
