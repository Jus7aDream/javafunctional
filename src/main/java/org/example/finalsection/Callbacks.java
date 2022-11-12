package org.example.finalsection;

import java.util.function.Consumer;

/**
 * @ In the name of Allah, most gracious and most merciful! 13.11.2022
 */
public class Callbacks {
    public static void main(String[] args) {
        hello("John", "Montana", value ->
                System.out.println("no lastName provided for " + value));

        hello2("John", null,() ->
                System.out.println("no lastName provided"));
    }

    static void hello(String fistName, String lastName, Consumer<String> callback) {
        System.out.println(fistName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(fistName);
        }
    }

    static void hello2(String fistName, String lastName, Runnable callback) {
        System.out.println(fistName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
//    function hello(fistName, LastName, callback){
//        console.log(fistName);
//        if(lastName){
//            console.log(lastName)
//        }else{
//            callback();
//        }
//    }
}
