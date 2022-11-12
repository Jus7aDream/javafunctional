package org.example.declarative;

import java.util.function.BiConsumer;

/**
 * @ In the name of Allah, most gracious and most merciful! 11.11.2022
 */
public class _BiConsumer {
    public static void main(String[] args) {
        //Normal java function
        Customer maria = new Customer("Maria", "99999");
        greetConsumerV2(maria, true);
        greetConsumerV2(maria, false);
        // Consumer Functional interface
        greetCustomConsumerV2.accept(maria, true);
        greetCustomConsumerV2.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
    //------------------------------------------------

    static void greetConsumerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
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

