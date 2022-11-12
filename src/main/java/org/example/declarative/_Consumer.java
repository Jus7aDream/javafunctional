package org.example.declarative;

import java.util.function.Consumer;

/**
 * @ In the name of Allah, most gracious and most merciful! 11.11.2022
 */
public class _Consumer {
    public static void main(String[] args) {
        //Normal java function
        Customer maria = new Customer("Maria", "99999");
        greetConsumer(maria);
        // Consumer Functional interface
        greetCustomConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);
    //------------------------------------------------

    static void greetConsumer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
