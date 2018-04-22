package com.TechODex.service;

import com.TechODex.dto.GreetingDTO;
import com.TechODex.model.Greeting;
import com.TechODex.dao.GreetingDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GreetingServiceImpl implements GreetingService {
    
    @Autowired
    private GreetingDAO greetingDAO;

    public GreetingDTO postAndReturnGreeting(GreetingDTO g) {

        Greeting greeting = new Greeting();

        //setting DTO to DAO object
        greeting.setFirstName(g.getFirstName());
        greeting.setLastName(g.getLastName());

        callDB(greeting);

        return g;
    }

    private void callDB(Greeting g){
        greetingDAO.save(g);
    }
}