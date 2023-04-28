package com.example.demospring8.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController   // chamas as funcoes rest
    public class PrimeiroController {
        @GetMapping(path = {"/ola","SAUDACAO"} )   // COLOCA {] PARA COLOCAR MAIS DE UMA PALAVRA COM UMA SO
        public String get() {                         // SERIA (PATTH = "ola")
            return "Bora que vamo que é nós!";

        }}

            /*GET se método é o mais utilizado, tem a função de solicitar ou
             É geralmente usado para o retorno de informações sobre uma entidade especificamente
             ou uma lista delas
         requisitar algum recurso ao servidor.
                                               */