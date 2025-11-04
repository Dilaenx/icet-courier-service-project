package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import edu.icet.ecom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/name")
    public String getName() {
        return "saman";
    }

    @GetMapping("/age")
    public Integer getAge() {
        return 18;
    }

    //@GetMapping("/get-customer")
   // public Customer getCustomer() {}

    List<Customer> customerList = new ArrayList<>();

    @GetMapping("/get-all")
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @GetMapping("/find-by-id/{id}")
    public Customer findByID(@PathVariable String id){
        return service.findById(id);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Customer> findByName(@PathVariable String name){
        return service.findByName(name);
    }

}
