package org.example.optionals;

import java.util.Optional;

/**
 * @ In the name of Allah, most gracious and most merciful! 12.11.2022
 */
public class _Optionals {
    public static void main(String[] args) {
        Person james = new Person("James", "James@gmail.com");
        Person john = new Person("John", null);

        if(john.getEmail().isPresent()){
            String email = john.getEmail().get();
            System.out.println(email.toLowerCase());
        }else {
            System.out.println("email not provided");
        }


        String email = james
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided");

        System.out.println(email);

    }
}

class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}