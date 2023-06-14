package com.innocodes.bankingapp.service;

import com.innocodes.bankingapp.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails mailDto  );
}
