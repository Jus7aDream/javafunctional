package org.example.combinatorpattern;

import java.time.LocalDate;

/**
 * @ In the name of Allah, most gracious and most merciful! 12.11.2022
 */
public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dob;

    public Customer(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }
}
