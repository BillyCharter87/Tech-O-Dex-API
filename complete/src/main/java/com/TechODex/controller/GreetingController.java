package com.TechODex.controller;

import com.TechODex.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.TechODex.service.GreetingServiceImpl;
import com.TechODex.dto.GreetingDTO;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

//    private GreetingServiceImpl greetingService = new GreetingServiceImpl();

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
