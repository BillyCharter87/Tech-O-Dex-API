package com.TechODex.controller;

import com.TechODex.dto.UserDTO;
import com.TechODex.model.Registration;
import com.TechODex.service.RegistrationService;
import com.TechODex.service.UserService;
import com.TechODex.dto.RegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public @ResponseBody
    RegistrationDTO registration(@RequestBody RegistrationDTO registration) {
        return registrationService.createRegistrant(registration);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public @ResponseBody
    void deleteRegistration(@RequestParam(value="id") Long id) {
        registrationService.deleteRegistrant(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public @ResponseBody
    List<Registration> findRegistration(@RequestParam(value="tech") String tech) {
        return registrationService.findAllRegistrant(tech);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody
    boolean registration(@RequestBody UserDTO userDTO) {
        return userService.login(userDTO);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/findAllTech", method = RequestMethod.GET)
    public @ResponseBody
    List<Registration>findAllTech() { return registrationService.findAllTech(); }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity health() {
        String ok = "OK";
        return ResponseEntity.ok(ok);
    }
}
