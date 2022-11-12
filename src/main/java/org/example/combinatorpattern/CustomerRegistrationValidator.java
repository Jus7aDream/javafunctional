package org.example.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static org.example.combinatorpattern.CustomerRegistrationValidator.*;
import static org.example.combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

/**
 * @ In the name of Allah, most gracious and most merciful! 12.11.2022
 */
public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {
    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@")
                ? SUCCESS
                : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isPhoneValid() {
        return customer -> customer.getPhoneNumber().startsWith("+7")
                ? SUCCESS
                : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isAnAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 14
                ? SUCCESS
                : IT_NOT_ADULT;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS)
                    ? other.apply(customer)
                    : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IT_NOT_ADULT
    }
}
