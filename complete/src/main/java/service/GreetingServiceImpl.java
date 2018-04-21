package service;

import dto.GreetingDTO;
import model.Greeting;
import dao.GreetingDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GreetingServiceImpl implements GreetingSevice {
    
    @Autowired
    private GreetingDAO greetingDAO;

    public GreetingDTO postAndReturnGreeting(GreetingDTO g) {

        Greeting greeting = new Greeting();

        //setting DTO to DAO object
        greeting.setFirstName(g.getFirstName());
        greeting.setLastName(g.getLastName());

        System.out.println("Service IMPL" + greeting.getFirstName());

        callDB(greeting);

        return g;
    }

    private void callDB(Greeting g){

        System.out.println("Service IMPL DB Call" + g.getFirstName());

        greetingDAO.save(g);
    }
}
