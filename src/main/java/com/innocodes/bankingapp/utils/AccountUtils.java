package com.innocodes.bankingapp.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_NOT_EXISTS_CODE = "003";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "Account credited successfully";
    public static final String ACCOUNT_EXISTS_MESSAGE  = "This user already has an account created";
    public static final String ACCOUNT_FOUND_SUCCESS  = "User Account found successfully";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE  = "User with this provided Account does not exist";

    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created!";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_MESSAGE = "Account has been successfully debited";



    public static String generateAccountNumber(){

        /**
         * Generate accountNumber that start with current year(2023) + any other random six digits
         */

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;
        // generate random number between min and max

        int randomNum = (int)(Math.random() * (max - min) + 1 + min);
        //convert the current year and random number to string, then concatenate

        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randomNum);
        StringBuilder accountNumber = new StringBuilder();
        return  accountNumber.append(year).append(randomNumber).toString();

    }

}
