package controller;

import org.springframework.web.bind.annotation.*;
import service.GreetingService;
import dto.GreetingDTO;

@RestController
public class GreetingController {

    private GreetingService greetingService = new GreetingService();

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/greeting")
    public @ResponseBody GreetingDTO greeting(@RequestBody GreetingDTO greeting) {
        return greetingService.setAndReturnGreeting(greeting);
    }
}
