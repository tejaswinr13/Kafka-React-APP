package com.knittech.web.RestController;


import com.knittech.kafkaproducerconsumer.model.FinancialDetails;
import com.knittech.kafkaproducerconsumer.model.PersonalDetails;
import com.knittech.kafkaproducerconsumer.service.SenderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
