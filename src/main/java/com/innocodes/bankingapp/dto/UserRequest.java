package com.innocodes.bankingapp.dto;

import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserRequest {
    private String firstName;
    private String lastName;
    private String otherName;
    private String address;
    private String gender;
    private String email;
    private BigDecimal accountBalance;
    private String phoneNumber;
    private String alternatePhoneNumber;
    private String stateOfOrigin;

}
