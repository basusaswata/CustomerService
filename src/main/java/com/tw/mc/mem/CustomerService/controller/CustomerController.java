package com.tw.mc.mem.CustomerService.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tw.mc.mem.CustomerService.model.Customer;

@RestController
public class CustomerController {

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value ="/customers/{customerId}" , method = RequestMethod.GET)
    public Customer getCUstomer(@PathVariable("customerId") int customerId) {
        return new Customer(1,"sas","bas","stage");
    }

}
