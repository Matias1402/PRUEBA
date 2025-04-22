package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "!HOLAaaaaa MUNDO!!!!!!";
    }


    @GetMapping("/SumaValor/{ValorUno}/{ValorDos}")
    public String sumar(@PathVariable int ValorUno, @PathVariable int ValorDos) {
        int Resultado = ValorUno + ValorDos;
        return "Resultado: " + Resultado;
    }


    @GetMapping("/RestaValor/{ValorUno}/{ValorDos}")
    public String Restar(@PathVariable int ValorUno, @PathVariable int ValorDos) {
        int Resultado = ValorUno - ValorDos;
        return "Resultado: " + Resultado;
    }


    @GetMapping("/MultiplicarValor/{ValorUno}/{ValorDos}")
    public String Multiplicar(@PathVariable int ValorUno, @PathVariable int ValorDos) {
        int Resultado = ValorUno * ValorDos;
        return "Resultado: " + Resultado;
    }


    @GetMapping("/DividirValor/{ValorUno}/{ValorDos}")
    public String Dividir(@PathVariable int ValorUno, @PathVariable int ValorDos) {
        double Resultado = ValorUno / ValorDos;
        return "Resultado: " + Resultado;
    }


    @GetMapping("/Suma")
    public String SumaSimple() {
        int a = 5;
        int b = 5;
        int Resultado = a + b;
        return "El resultado de tu calculo es: " + Resultado;
    }


    @GetMapping("/Resta")
    public String Resta(){
        int a = 5;
        int b = 5;
        int Resultado = a + b;
        return "El resultado de tu calculo es: " + Resultado;
    }


    @GetMapping("/Multiplicacion")
    public String Multiplicacion(){
        int a = 5;
        int b = 5;
        int Resultado = a * b;
        return "El resultado de tu calculo es: " + Resultado;
    }


    @GetMapping("/Division")
    public String Division(){
        int a = 10;
        int b = 5;
        double Resultado = a/b;
        return "El resultado de tu calculo es: " + Resultado;
    }


}