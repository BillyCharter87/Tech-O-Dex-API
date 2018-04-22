package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;

public interface RegistrationService {
    RegistrationDTO postAndReturnGreeting(RegistrationDTO greetingDTO);
}
