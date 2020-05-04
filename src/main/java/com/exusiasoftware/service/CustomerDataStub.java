package com.exusiasoftware.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.exusiasoftware.model.Customer;


public class CustomerDataStub {
	private static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

	// Create some sample users here=>
	static {
		customers.put(1, new Customer(1, "Phil Herold", "Manager", "R&D"));
		customers.put(2, new Customer(2, "Chris Olinger", "CTO", "Executive"));
		customers.put(3, new Customer(3, "John Leveille", "CEO", "Executive"));
	}

	public static List<Customer> getAllCustomers() {
		return new ArrayList<Customer>(customers.values());
	}

	public static Customer getCustomer(Integer id) {
		return customers.get(id);
	}

	public static Customer get(Integer id) {
		return customers.get(id);
	}

	public static Customer save(Customer customer) {
		Integer id = customers.keySet().stream().mapToInt(Integer::intValue).max().getAsInt() + 1;
		customer.setId(id);
		customers.put(id, customer);
		return customer;
	}

	public static Customer update(Integer id, Customer customer) {
		customer.setId(id);
		customers.put(id, customer);
		return customer;
	}

	public static Customer delete(Integer id) {
		return customers.remove(id);
	}

	public static List<Customer> findCustomerByName(String name) {
		return customers.values().stream().filter(u -> u.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}
}
