package com.tw.mc.mem.CustomerService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tw.mc.mem.CustomerService.model.Customer;

@RestController
@RefreshScope
public class CustomerController {

	 @Value("${user.role}")
	  private String role;
	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(value ="/customers/{customerId}" , method = RequestMethod.GET)
    public Customer getCUstomer(@PathVariable("customerId") int customerId) {
		
        return new Customer(1,"sas","bas",role);
    }

}
