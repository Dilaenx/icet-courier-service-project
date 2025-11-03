package edu.icet.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerControllerForm {

    @GetMapping
    public String name(){
        return "Dilaen";
    }
}
