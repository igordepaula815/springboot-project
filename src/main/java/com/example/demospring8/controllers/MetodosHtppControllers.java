package com.example.demospring8.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/metodos")
public class MetodosHtppControllers {
@GetMapping  // o request que esta acima da public class ja chama todos que estao abaixo
    public String Get() {
        return "Requisicao GET" ;
    }
@PostMapping
    public String post() {
        return "Requisicao POST" ;
    }
@PutMapping
    public String put () {
        return "Requisicao PUT" ;
    }
@PatchMapping
    public String patch() {
        return "Requisicao PATCH" ;
    }
@DeleteMapping
    public String delete() {
        return "Requisicao DELETE" ;
    }













}
