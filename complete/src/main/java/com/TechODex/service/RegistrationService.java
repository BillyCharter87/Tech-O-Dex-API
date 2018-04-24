package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;
import com.TechODex.model.Registration;

import java.util.List;

public interface RegistrationService {
    RegistrationDTO createRegistrant(RegistrationDTO greetingDTO);
    RegistrationDTO deleteRegistrant(RegistrationDTO greetingDTO);
    List<Registration> findAllRegistrant(RegistrationDTO greetingDTO);
}
