package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;

public interface RegistrationService {
    RegistrationDTO createRegistrant(RegistrationDTO greetingDTO);
    RegistrationDTO deleteRegistrant(RegistrationDTO greetingDTO);
    void findAllRegistrant(RegistrationDTO greetingDTO);
}
