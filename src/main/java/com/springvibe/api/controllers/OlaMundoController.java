package com.springvibe.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {
    
    @GetMapping("/oi")
    public String OlaMundo() {
        return "Olá Mundo";
    }
}
