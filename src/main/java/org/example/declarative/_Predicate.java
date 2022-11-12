package org.example.declarative;

import java.util.function.Predicate;

/**
 * @ In the name of Allah, most gracious and most merciful! 11.11.2022
 */
public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("+79676264267"));
        System.out.println(isPhoneNumberValid("+89676264267"));

        System.out.println(isPhoneNumberValidPredicate.test("+79676264267"));
        System.out.println(isPhoneNumberValidPredicate.test("+89676264267"));

        System.out.println();
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+89676264267"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+89676264333"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("+89676264333"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("+79676264333"));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
        phoneNumber.startsWith("+7")&&phoneNumber.length()==12;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+7") && phoneNumber.length() == 12;
    }
}
