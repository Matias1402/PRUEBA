package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @GetMapping("/clientes")
    public String index(){
        return "Bienvenido, este es el listado de clientes";
    }

}
