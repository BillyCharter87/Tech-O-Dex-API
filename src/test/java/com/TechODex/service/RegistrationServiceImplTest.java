package com.TechODex.service;

import com.TechODex.dao.RegistrationDAO;
import com.TechODex.dto.RegistrationDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
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

    @Mock
    private RegistrationDTO registrationDTO;

    @Before
    public void setup() {
        registrationDTO.seteId("abc123");
        registrationDTO.setTech("AWS");
        registrationDTO.setFirstName("Bob");
        registrationDTO.setLastName("Tom");
    }


    @Test
    public void createRegistrant() throws Exception {
        registrationServiceImpl.createRegistrant(registrationDTO);
//        verify(registrationServiceImpl).
    }

    @Test
    public void deleteRegistrant() throws Exception {

    }

    @Test
    public void findAllRegistrant() throws Exception {

    }

    @Test
    public void findAllTech() throws Exception {

    }

}