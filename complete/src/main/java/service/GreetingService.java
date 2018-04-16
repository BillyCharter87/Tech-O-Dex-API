package service;

import model.Greeting;

public class GreetingService {

    Greeting greeting = new Greeting();

    public Greeting setAndReturnGreeting(String name) {
        System.out.println("service  WORKED!!");
        name = name + " holla";
        greeting.setName(name);
        return greeting;
    }
}
