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
//import static org.junit.Assert.assertNotEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;


/**
 * Created by Billy on 7/15/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceImplTest {

    @InjectMocks
    private RegistrationServiceImpl registrationServiceImpl;

    @Mock
    private RegistrationDTO registrationDTO;

    @Mock
    private Registration registration;


    @Before
    public void setup() {
        registrationDTO.seteId("abc123");
        registrationDTO.setTech("AWS");
        registrationDTO.setFirstName("Bob");
        registrationDTO.setLastName("Tom");

    }


    @Test
    public void createRegistrant() throws Exception {
//        Mockito.when(registrationServiceImpl.createRegistrant(registrationDTO)).thenReturn(registrationDTO);
        Mockito.when(registrationServiceImpl.createRegistrant(registrationDTO)).thenReturn(registrationDTO);
        registrationServiceImpl.createRegistrant(registrationDTO);
        Mockito.verify(registrationServiceImpl, Mockito.times(1)).createRegistrant(registrationDTO);
    }

    @Test
    public void deleteRegistrant() throws Exception {

//        registrationServiceImpl.deleteRegistrant(Mockito.anyLong());
//        Mockito.verify(registrationServiceImpl,Mockito.times(1)).deleteRegistrant(Mockito.anyLong());
    }

    @Test
    public void findAllRegistrant() throws Exception {

    }

    @Test
    public void findAllTech() throws Exception {

    }

}