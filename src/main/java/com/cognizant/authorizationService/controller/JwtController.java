package com.cognizant.authorizationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.authorizationService.model.JwtRequest;
import com.cognizant.authorizationService.model.JwtResponse;
import com.cognizant.authorizationService.service.JwtService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin
//@RequestMapping("/authenticate")
public class JwtController {
	@Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}