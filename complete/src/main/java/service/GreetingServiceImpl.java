package service;

import dto.GreetingDTO;
import model.Greeting;
import dao.GreetingDAO;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingSevice {

    private Greeting greeting = new Greeting();
    private GreetingDAO greetingDAO;

    public GreetingDTO postAndReturnGreeting(GreetingDTO g) {

        //setting DTO to DAO object
        greeting.setFirstName(g.getFirstName());
        greeting.setLastName(g.getLastName());

        callDB(greeting);

        //setting DAO back to DTO
        g.setFirstName(greeting.getFirstName());
        g.setLastName(greeting.getLastName());

        return g;
    }

    private void callDB(Greeting g){

        greetingDAO.insertGreeting(g);
    }
}
