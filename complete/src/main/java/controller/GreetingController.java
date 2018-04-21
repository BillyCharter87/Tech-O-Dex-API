package controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping("/health")
    public ResponseEntity health() {
        String ok = "OK";
        System.out.println("Controller");
        return ResponseEntity.ok(ok);
    }
}
