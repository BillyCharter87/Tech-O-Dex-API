package controller;

import org.springframework.web.bind.annotation.*;
import service.GreetingServiceImpl;
import dto.GreetingDTO;

@RestController
public class GreetingController {

    private GreetingServiceImpl greetingService = new GreetingServiceImpl();

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/greeting")
    public @ResponseBody GreetingDTO greeting(@RequestBody GreetingDTO greeting) {
        return greetingService.postAndReturnGreeting(greeting);
    }
}
