package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/name")
    public String getName(){
        return "Dilaen";
    }

    @GetMapping("/age")
    public int getAge(){
        return 18;
    }

    @GetMapping("/details")
    public Customer getCustomer(){
        return new Customer(
                "Dilaen",
                27,
                10000000.0);
    }
}
