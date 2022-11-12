package org.example.optionals;

import java.util.Optional;

/**
 * @ In the name of Allah, most gracious and most merciful! 12.11.2022
 */
public class Main {
    public static void main(String[] args) {
        Optional.ofNullable("John@gmail.com")
//                .orElseGet(()-> "default value");
//        .orElseThrow(()-> new IllegalStateException("e IllegalStateException"));
        .ifPresentOrElse(
                email->System.out.println("Sending email to " + email),
                ()-> System.out.println("Cannot send email"));
//        System.out.println(value);
    }
}
