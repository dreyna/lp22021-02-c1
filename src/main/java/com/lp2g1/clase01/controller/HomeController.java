/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lp2g1.clase01.controller;


import com.lp2g1.clase01.service.SUsuario;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController
public class HomeController {
    @Autowired
    private SUsuario su;
    @GetMapping("/users")
    List<Map<String, Object>>mensaje(){   
    return su.readAll();
    }
}
