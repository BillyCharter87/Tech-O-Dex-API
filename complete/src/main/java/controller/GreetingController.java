package controller;

import org.springframework.web.bind.annotation.*;
import service.GreetingService;
import dto.GreetingDTO;

@RestController
public class GreetingController {

    GreetingService service = new GreetingService();

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/greeting")
    public GreetingDTO greeting(@RequestBody GreetingDTO greeting) {
        System.out.println(greeting.getfName());
        return service.setAndReturnGreeting(greeting);
    }
}
