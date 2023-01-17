package com.example.Damian.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo que tal vamos";
    }

    @GetMapping("/comida")
    public String comida() {
        return "Mi comida favorita es el sushi";
    }

    @GetMapping("/lugaresVisitados")
    public String lugaresVisitados() {
        return "Conozco Uruguay y Brasil";
    }

    @GetMapping("/hobbies")
    public String hobbies() {
        return "Me gusta salir con amigos";
    }

    @GetMapping("/datosPersonales")
    public String datosPersonales() {
        return "Nombre: Damian, Apellido: Bettini, Edad: 23";
    }
}
