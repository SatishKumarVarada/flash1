package com.rbs.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	
	@RequestMapping("/details")
	public String getAllCustomerDetails() {
		
		
		return"home.jsp";
		
	}

}
