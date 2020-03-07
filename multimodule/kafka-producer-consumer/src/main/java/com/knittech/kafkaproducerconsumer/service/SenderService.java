package com.knittech.kafkaproducerconsumer.service;

import com.knittech.kafkaproducerconsumer.model.FinancialDetails;
import com.knittech.kafkaproducerconsumer.model.PersonalDetails;

public interface SenderService {

    void sendPersonalDetails(PersonalDetails personalDetails);

    void sendFinancialDetails(FinancialDetails financialDetails);
}
