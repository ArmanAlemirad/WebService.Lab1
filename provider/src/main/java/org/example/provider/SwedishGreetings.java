package org.example.provider;

import org.example.service.Greeting;

public class SwedishGreetings implements Greeting {
    @Override
    public String sayHello() {
        return "Hej";
    }
}
