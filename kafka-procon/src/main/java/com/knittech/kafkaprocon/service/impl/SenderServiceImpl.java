package com.knittech.kafkaprocon.service.impl;

import com.knittech.kafkaprocon.model.FinancialDetails;
import com.knittech.kafkaprocon.model.PersonalDetails;
import com.knittech.kafkaprocon.service.SenderService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SenderServiceImpl implements SenderService {

    @Autowired
    private KafkaTemplate<String, PersonalDetails> personalDetailsKafkaTemplate;

    @Autowired
    private KafkaTemplate<String, FinancialDetails> financialDetailsKafkaTemplate;

    @Value(value = "${kafka.topic-one}")
    private String topicOne;

    @Value(value = "${kafka.topic-two}")
    private String topicTwo;

    @Override
    public void sendPersonalDetails(PersonalDetails personalDetails) {
        personalDetailsKafkaTemplate.send(topicOne, personalDetails);
    }

    @Override
    public void sendFinancialDetails(FinancialDetails financialDetails) {
        financialDetailsKafkaTemplate.send(topicTwo, financialDetails);
    }
}
