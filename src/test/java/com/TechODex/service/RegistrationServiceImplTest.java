package com.TechODex.service;

import com.TechODex.dao.RegistrationDAO;
import com.TechODex.dto.RegistrationDTO;
import com.TechODex.model.Registration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static junit.framework.TestCase.assertSame;
import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.verify;


/**
 * Created by Billy on 7/15/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceImplTest {

    @InjectMocks
    private RegistrationServiceImpl registrationServiceImpl;

    @Mock
    private RegistrationDAO registrationDAO;

    private RegistrationDTO registrationDTO;
    private Registration registration;

    @Before
    public void setup() {
        registration = new Registration();
        registration.seteId("abc123");
        registration.setTech("AWS");
        registration.setFirstName("Bob");
        registration.setLastName("Tom");

        registrationDTO = new RegistrationDTO();
        registrationDTO.seteId("abc123");
        registrationDTO.setTech("AWS");
        registrationDTO.setFirstName("Bob");
        registrationDTO.setLastName("Tom");
    }

    @Test
    public void createRegistrantTest() throws Exception {
        final RegistrationDTO result = registrationServiceImpl.createRegistrant(registrationDTO);
        assertSame(registrationDTO, result);

        verify(registrationDAO).save(refEq(registration));
    }

    @Test
    public void deleteRegistrantTest() {
        registrationServiceImpl.deleteRegistrant(Mockito.anyLong());
        verify(registrationDAO).deleteById(Mockito.anyLong());
    }

    @Test
    public void findAllRegistrantTest(){

        registrationServiceImpl.findAllRegistrant(Mockito.anyString());
        verify(registrationDAO).findByTech(Mockito.anyString());
    }

    @Test
    public void findAllTechTest(){

        registrationServiceImpl.findAllTech();
        verify(registrationDAO).findAll();

    }
}