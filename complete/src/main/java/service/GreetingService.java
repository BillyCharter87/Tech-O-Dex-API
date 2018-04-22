package service;

import dto.GreetingDTO;

public interface GreetingService {
    GreetingDTO postAndReturnGreeting(GreetingDTO greetingDTO);
}
