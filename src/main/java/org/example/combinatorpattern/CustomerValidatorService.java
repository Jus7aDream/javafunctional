package org.example.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

/**
 * @ In the name of Allah, most gracious and most merciful! 12.11.2022
 */
public class CustomerValidatorService {
    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.contains("+7");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 14;
    }
    public boolean isValid (Customer customer){
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumber(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }
}
