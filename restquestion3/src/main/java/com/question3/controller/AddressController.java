package com.question3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.question3.address.Address;
import com.question3.service.AddressService;

@RestController
public class AddressController {
	
	private AddressService addressService=new AddressService();
	
	@GetMapping("/address/{id}")
	public Address getTopic(@PathVariable String id) {
		return addressService.getTopic(id);
	}

}