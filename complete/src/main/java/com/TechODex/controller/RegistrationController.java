package com.TechODex.controller;

import com.TechODex.model.Registration;
import com.TechODex.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.TechODex.dto.RegistrationDTO;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public @ResponseBody
    RegistrationDTO registration(@RequestBody RegistrationDTO registration) {
        return registrationService.createRegistrant(registration);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    RegistrationDTO deleteRegistration(@RequestBody RegistrationDTO registration) {
        return registrationService.deleteRegistrant(registration);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Registration> findRegistration(@RequestParam(value="tech") String tech) {
        return registrationService.findAllRegistrant(tech);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity health() {
        String ok = "OK";
        return ResponseEntity.ok(ok);
    }
}
