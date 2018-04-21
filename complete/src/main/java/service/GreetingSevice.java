package service;

import dto.GreetingDTO;

public interface GreetingSevice {
    GreetingDTO postAndReturnGreeting(GreetingDTO greetingDTO);
}
