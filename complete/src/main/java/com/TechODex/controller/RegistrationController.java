package com.TechODex.controller;

import com.TechODex.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.TechODex.dto.RegistrationDTO;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public @ResponseBody
    RegistrationDTO greeting(@RequestBody RegistrationDTO registration) {
        return registrationService.postAndReturnGreeting(registration);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity health() {
        String ok = "OK";
        System.out.println("Controller");
        return ResponseEntity.ok(ok);
    }
}
