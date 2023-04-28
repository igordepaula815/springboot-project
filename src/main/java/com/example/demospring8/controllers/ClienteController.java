package com.example.demospring8.controllers;


import com.example.demospring8.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "clientes")       // colocando request acima da classe tem que chamar yes/Cliente na url
public class ClienteController {

    @GetMapping( path = "qualquer")   // chama o get para diricionar para a url (path)
    public Cliente obterCliente() {        // criar metodo e passar o parametro criado na classe cliente

        return new Cliente(28,"Pedro","555.333.222-00") ;  // chama a classe cliente
    }

    @GetMapping ("/{id}")  // dentro do par de chaves pra dizer que é uma variavel
    public Cliente obterClientePorId1 (@PathVariable int id) { //converte le a variavel int id o path variable coloca
        return  new Cliente(id,"maria" ,"983.222.333-90") ; //  http://localhost:8080/clientes/123
    }
@GetMapping                                                       //defaultvaluer e o valor padrao da id da o valor anterior
    public Cliente obterclientePorid2(@RequestParam(name = "id", defaultValue = "1") int id) {  // request para e chamar no padrao na url
           return new Cliente(id,"joao","444.555.666-12") ;

           //   requestparam e chamar no padrao na url http://localhost:8080/clientes?id=123   escolher o numero
           //  ve o valor padrao http://localhost:8080/clientes


    }

}

