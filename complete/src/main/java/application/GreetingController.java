package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.GreetingService;
import dto.GreetingDTO;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public @ResponseBody GreetingDTO greeting(@RequestBody GreetingDTO greeting) {
        System.out.println("Controller" + greeting.getFirstName());
        return greetingService.postAndReturnGreeting(greeting);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity health() {
        String ok = "OK";
        System.out.println("Controller");
        return ResponseEntity.ok(ok);
    }
}
