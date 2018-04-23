package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;
import com.TechODex.model.Registration;
import com.TechODex.dao.RegistrationDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
    
    @Autowired
    private RegistrationDAO greetingDAO;

    public RegistrationDTO postAndReturnGreeting(RegistrationDTO reg) {

        Registration registration = new Registration();

        //setting DTO to DAO object
        registration.setFirstName(reg.getFirstName());
        registration.setLastName(reg.getLastName());

        callDB(registration);

        return reg;
    }

    private void callDB(Registration reg){
        greetingDAO.save(reg);
    }
}