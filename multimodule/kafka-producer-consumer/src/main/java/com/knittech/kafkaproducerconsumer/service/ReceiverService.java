package com.knittech.kafkaproducerconsumer.service;

import com.knittech.kafkaproducerconsumer.model.FinancialDetails;
import com.knittech.kafkaproducerconsumer.model.PersonalDetails;

public interface ReceiverService {

    void receivePersonalDetails(PersonalDetails personalDetails);

    void receiveFinancialDetails(FinancialDetails financialDetails);
}
