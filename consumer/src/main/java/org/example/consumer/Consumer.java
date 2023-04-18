package org.example.consumer;





import org.example.service.Greeting;

import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {

        //Find all implementations of Greeting...
        ServiceLoader<Greeting> greetings = ServiceLoader.load(Greeting.class);

        for (var greeting : greetings){
            System.out.println(greeting.sayHello());
        }

    }
}