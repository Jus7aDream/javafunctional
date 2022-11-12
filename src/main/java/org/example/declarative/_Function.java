package org.example.declarative;

import java.util.function.Function;

/**
 * @ In the name of Allah, most gracious and most merciful! 10.11.2022
 */
public class _Function {
    public static void main(String[] args) {
        int increment = increment(7);
        System.out.println(increment);
        Integer integer = integerByOneFunction.apply(7);
        System.out.println(integer);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                integerByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));
    }

    static Function<Integer, Integer>
            integerByOneFunction = number -> number + 1 ;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number) {
        return number + 1 ;
    }

}
