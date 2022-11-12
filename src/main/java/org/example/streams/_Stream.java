package org.example.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.example.streams._Stream.Gender.*;


/**
 * @ In the name of Allah, most gracious and most merciful! 11.11.2022
 */
public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );
//        people.stream()
////                .map(person -> person.getName())
//                .map(Person::getName)
////                .mapToInt(name -> name.length())
//                .mapToInt(String::length)
////                .collect(Collectors.toSet())
//                .forEach( System.out::println);

        Predicate<Person> personPredicate = p -> FEMALE.equals(p.getGender());

        boolean containsOnlyFemales = people.stream()
//                .allMatch(personPredicate)
                .anyMatch(personPredicate);
        System.out.println(containsOnlyFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
