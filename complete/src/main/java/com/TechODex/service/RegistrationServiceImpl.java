package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;
import com.TechODex.model.Registration;
import com.TechODex.dao.RegistrationDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService {
    
    @Autowired
    private RegistrationDAO registrationDAO;

    public RegistrationDTO createRegistrant(RegistrationDTO reg) {
        saveUpdateRegistration(setDTOToModel(reg));
        return reg;
    }

    public RegistrationDTO deleteRegistrant(RegistrationDTO reg) {
        deleteRegistrant(setDTOToModel(reg));

        return reg;
    }

    public List<Registration> findAllRegistrant(String tech) {
        return findAllRegistrantDAO(tech);
    }

    private Registration setDTOToModel(RegistrationDTO dto){
        Registration registration = new Registration();

        registration.setFirstName(dto.getFirstName());
        registration.setLastName(dto.getLastName());
        registration.seteId(dto.geteId());
        registration.setTech(dto.getTech());

        return registration;
    }

    private void saveUpdateRegistration(Registration reg){ registrationDAO.save(reg);}
    private void deleteRegistrant(Registration reg){registrationDAO.delete(reg);}
    private List<Registration> findAllRegistrantDAO(String tech){
        Registration reg = new Registration(tech);
        return registrationDAO.findByTech(reg.getTech()); }
}