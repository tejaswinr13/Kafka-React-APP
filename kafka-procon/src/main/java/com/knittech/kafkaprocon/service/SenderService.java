package com.knittech.kafkaprocon.service;

import com.knittech.kafkaprocon.model.FinancialDetails;
import com.knittech.kafkaprocon.model.PersonalDetails;

public interface SenderService {

    void sendPersonalDetails(PersonalDetails personalDetails);

    void sendFinancialDetails(FinancialDetails financialDetails);
}
