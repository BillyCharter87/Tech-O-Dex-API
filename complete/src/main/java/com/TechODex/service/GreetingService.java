package com.TechODex.service;

import com.TechODex.dto.GreetingDTO;

public interface GreetingService {
    GreetingDTO postAndReturnGreeting(GreetingDTO greetingDTO);
}
