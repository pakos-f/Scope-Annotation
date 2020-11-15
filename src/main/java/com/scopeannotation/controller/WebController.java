package com.scopeannotation.controller;

import com.scopeannotation.components.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WebController {

	private final Customer customer;

	@RequestMapping("/address") // singleton
	public String address() {
		String result = customer.getAddress();
		customer.setAddress("EU");
		return "init Data: " + result + "|-----| modified Data: " + customer.getAddress();
	}

	@RequestMapping("/addresscheck") // singleton
	public String addresscheck() {
		return "check Data: " + customer.getAddress();
	}

	@RequestMapping("/age")	// session scope
	public String age() {
		String result = customer.getAge();
		customer.setAge("25");
		
		return "init Data: " + result + "|-----| modified Data: " + customer.getAge();
	}

	@RequestMapping("/age1") // session scope
	public String age1() {
		String result = customer.getAge();
		customer.setAge("26");
		
		return "init Data: " + result + "|-----| modified Data: " + customer.getAge();
	}
	
	
	@RequestMapping("/agecheck") // session scope
	public String agecheck() {
		return "check Data: " + customer.getAge();
	}
}
