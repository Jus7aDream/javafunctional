package org.example.finalsection;

import java.util.function.BiFunction;

/**
 * @ In the name of Allah, most gracious and most merciful! 13.11.2022
 */
public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String, Integer, String> upperCaseName = (name, age) ->
        {
            if (name.isBlank()) throw new IllegalStateException("name is Blank");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply("Alex", 20));
    }
}
