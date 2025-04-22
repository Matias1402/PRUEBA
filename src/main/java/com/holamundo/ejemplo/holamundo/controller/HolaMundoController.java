package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping ("/api")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "!HOLAaaaaa MUNDO!!!!!!";
    }

    @GetMapping("/Suma")
    public String sumar(@RequestParam double a, @RequestParam double b) {
        return "Resultado: " + (a + b);
    }

}