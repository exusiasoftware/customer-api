package com.exusiasoftware.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.exusiasoftware.model.Customer;
import com.exusiasoftware.service.CustomerService;




@RestController
@RequestMapping("customer-api/v1")

public class CustomerController {
	private final CustomerService service;

	@Autowired
	public CustomerController(CustomerService service) {
		this.service = service;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(value = "customers/all")
	public List<Customer> getAllCustomers() {
		return service.getAllCustomers();

	}

	@CrossOrigin(origins = "*")
	@GetMapping(value = "customer/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return service.getCustomer(id);
	}

	@CrossOrigin(origins = "*")
	@PostMapping(value = "customers")
	public Customer save(@RequestBody Customer customer) {
		return service.save(customer);
	}

	@CrossOrigin(origins = "*")   
	@PutMapping(value = "customer/{id}")
	public Customer update(@PathVariable Integer id, @RequestBody Customer customer) {
		return service.update(id, customer);
	}

	@CrossOrigin(origins = "*")
	@DeleteMapping(value = "customers/{id}")
	public Customer delete(@PathVariable Integer id) {
		return service.delete(id);
	}

	@CrossOrigin(origins = "*")
	@GetMapping(value = "customer/name/{name}") 
	 public List<Customer> findCustomerByName(@PathVariable String name)  {
	 	
		return service.findCustomerByName(name);
	}







}

