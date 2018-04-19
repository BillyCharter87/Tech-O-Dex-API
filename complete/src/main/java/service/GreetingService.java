package service;

import dto.GreetingDTO;
import dao.GreetingDAO;
import service.Greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements Greeting{

    private GreetingDAO greeting = new GreetingDAO();

    public GreetingDTO setAndReturnGreeting(GreetingDTO g) {

        //setting DTO to DAO object
        greeting.setFirstName(g.getFirstName());
        greeting.setLastName(g.getLastName());

        callDB(greeting);

        //setting DAO back to DTO
        g.setFirstName(greeting.getFirstName());
        g.setLastName(greeting.getLastName());

        return g;
    }

    private void callDB(GreetingDAO g){

    }
}
