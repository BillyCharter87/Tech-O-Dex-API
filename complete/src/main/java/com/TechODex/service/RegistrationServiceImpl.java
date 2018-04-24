package com.TechODex.service;

import com.TechODex.dto.RegistrationDTO;
import com.TechODex.model.Registration;
import com.TechODex.dao.RegistrationDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    public void findAllRegistrant(RegistrationDTO reg) {
        List <Registration> list = new ArrayList<Registration>();
        list = findAllRegistrant(setDTOToModel(reg));
        for (List list: findAllRegistrant(setDTOToModel(reg))) {
            System.out.println(rega.getFirstName());
        }
//        return findAllRegistrant(setDTOToModel(reg));
    }

    public Registration setDTOToModel(RegistrationDTO dto){
        Registration registration = new Registration();

        registration.setFirstName(dto.getFirstName());
        registration.setLastName(dto.getLastName());
        registration.seteId(dto.geteId());

        return registration;
    }

    private void saveUpdateRegistration(Registration reg){
        registrationDAO.save(reg);
    }
    private void deleteRegistrant(Registration reg){registrationDAO.delete(reg);}
    private List<Registration> findAllRegistrant(Registration reg){registrationDAO.findByTech(reg.getTech());}
}