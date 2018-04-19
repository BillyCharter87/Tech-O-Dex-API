package service;

import dto.GreetingDTO;

public interface Greeting {
    GreetingDTO setAndReturnGreeting(GreetingDTO greetingDTO);
}
