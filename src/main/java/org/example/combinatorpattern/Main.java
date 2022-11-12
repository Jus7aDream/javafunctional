package org.example.combinatorpattern;

import java.time.LocalDate;

import static org.example.combinatorpattern.CustomerRegistrationValidator.*;

/**
 * @ In the name of Allah, most gracious and most merciful! 12.11.2022
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+79995554433",
                LocalDate.of(2000, 1, 1)
        );
        System.out.println(new CustomerValidatorService().isValid(customer));

        //if valid we can store customer in db

        //Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);
        if(result!=ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
