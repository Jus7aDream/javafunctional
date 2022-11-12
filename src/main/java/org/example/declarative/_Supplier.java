package org.example.declarative;

import java.util.function.Supplier;

/**
 * @ In the name of Allah, most gracious and most merciful! 11.11.2022
 */
public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());

    }

    static String getDBConnectionUrl() {
        return "jdbc:postgresql://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier =
            () -> "jdbc:postgresql://localhost:5432/users";
}
