/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.GPE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 07014437151
 */
@SpringBootApplication
public class ModalidadeTeste implements CommandLineRunner {

    @Autowired
    private ModalidadeService service;

    public static void main(String[] args) {
        SpringApplication.run(ModalidadeTeste.class, args);
    }

    public void run(String... args) throws Exception {
        Modalidade modalidade = new Modalidade("ruth");
        
        Modalidade m =  service.getModalidadeById(1L);
        
        System.out.println(m.getNome());
    }

}
