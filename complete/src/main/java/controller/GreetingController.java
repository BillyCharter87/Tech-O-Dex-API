package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import service.GreetingService;
import model.Greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    GreetingService service = new GreetingService();

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World")String name) {
        System.out.println("controller WORKED!!");
        return service.setAndReturnGreeting(name);
    }
}
