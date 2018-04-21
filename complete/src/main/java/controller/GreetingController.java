package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.GreetingSevice;
import dto.GreetingDTO;

@RestController
public class GreetingController {

    @Autowired
    private GreetingSevice greetingService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/greeting")
    public @ResponseBody GreetingDTO greeting(@RequestBody GreetingDTO greeting) {
        System.out.println("Controller" + greeting.getFirstName());
        return greetingService.postAndReturnGreeting(greeting);
    }
}
