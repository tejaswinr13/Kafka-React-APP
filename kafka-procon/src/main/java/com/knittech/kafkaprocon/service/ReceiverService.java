package com.knittech.kafkaprocon.service;

import com.knittech.kafkaprocon.model.FinancialDetails;
import com.knittech.kafkaprocon.model.PersonalDetails;

public interface ReceiverService {

    void receivePersonalDetails (PersonalDetails personalDetails);

    void receiveFinancialDetails (FinancialDetails financialDetails);
}
