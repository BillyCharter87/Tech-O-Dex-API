package service;

import dto.GreetingDTO;
import dao.GreetingDAO;

public class GreetingService {

    GreetingDAO greeting = new GreetingDAO();

    public GreetingDTO setAndReturnGreeting(GreetingDTO g) {

        //setting DTO to DAO object
        greeting.setFName(g.getfName());
        greeting.setLName(g.getlName());

        callDB(greeting);

        //setting DAO back to DTO
        g.setFName(greeting.getfName());
        g.setLName(greeting.getlName());

        return g;
    }

    private void callDB(GreetingDAO g){

        System.out.println(g.getfName());
    }
}
