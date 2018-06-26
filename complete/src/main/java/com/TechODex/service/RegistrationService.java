package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;
import com.TechODex.model.Registration;

import java.util.List;

public interface RegistrationService {
    RegistrationDTO createRegistrant(RegistrationDTO greetingDTO);
    void deleteRegistrant(Long id);
    List<Registration> findAllRegistrant(String tech);
    List<Registration> findAllTech();
}
