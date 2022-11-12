package org.example.declarative;

import java.util.function.BiFunction;

/**
 * @ In the name of Allah, most gracious and most merciful! 11.11.2022
 */
public class _BiFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyByFunction.apply(4, 100));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
