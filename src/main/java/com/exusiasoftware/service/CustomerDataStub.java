package com.exusiasoftware.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.exusiasoftware.model.Customer;


public class CustomerDataStub {
	private static Map<Integer, Customer> customers = new HashMap<Integer, Customer>();


	static {
		customers.put(1, new Customer(1, "Avery Bean", "Manager", "R&D"));
		customers.put(2, new Customer(2, "Daniels Yang", "CTO", "Executive"));
		customers.put(3, new Customer(3, "Lenore Lane", "CEO", "Executive"));
		customers.put(4, new Customer(4, "Ruthie Parks", "IT Manager", "IT"));
		customers.put(5, new Customer(5, "Rachael Foster", "Manager", "Production"));
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
