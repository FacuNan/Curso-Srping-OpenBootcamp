/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.db_spring_boot.db_springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author facnan
 */
@RestController
public class BookController {
    @GetMapping("/Hola")
    public String holaMundo(){
        return "Cambio Realizado";
    }
    
}
