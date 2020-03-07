package com.knittech.kafkaprocon.service.impl;

import com.knittech.kafkaprocon.model.Details;
import com.knittech.kafkaprocon.model.FinancialDetails;
import com.knittech.kafkaprocon.model.PersonalDetails;
import com.knittech.kafkaprocon.service.DetailsService;
import com.knittech.kafkaprocon.service.ReceiverService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class ReceiverServiceImpl implements ReceiverService {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private DetailsService detailsService;

    private boolean personalDetailsConsumed = false;
    private boolean financialDetailsConsumed = false;

    private  PersonalDetails personalDetail;
    private  FinancialDetails financialDetail;

    @Override
    @KafkaListener(topics= "${kafka.topic-one}", groupId = "details", containerGroup = "kafkaListenerContainerFactory")
    public void receivePersonalDetails(PersonalDetails personalDetails) {
        logger.info("Received Message\t" + personalDetails);
        personalDetail = personalDetails;
        personalDetailsConsumed = true;
        joinTwoJson();
    }

    @Override
    @KafkaListener(topics= "${kafka.topic-two}", groupId = "details", containerGroup = "financialDetailsKafkaListenerContainerFactory")
    public void receiveFinancialDetails(FinancialDetails financialDetails) {
        logger.info("Received Message\t" + financialDetails);
        financialDetail = financialDetails;
        financialDetailsConsumed = true;
        joinTwoJson();
    }

    public void joinTwoJson (){
        if(personalDetailsConsumed && financialDetailsConsumed){

            //reset status of consumption
            personalDetailsConsumed = false;
            financialDetailsConsumed = false;

            //code to join two objects here
            Details details = new Details(personalDetail, financialDetail);
            detailsService.save(details);
            logger.info("Saved Details: \t" + details);

        }
    }
}
