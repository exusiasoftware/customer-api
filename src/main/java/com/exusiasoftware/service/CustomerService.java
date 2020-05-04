package com.exusiasoftware.service;

import java.util.List;

import com.exusiasoftware.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();

	Customer getCustomer(Integer id);

	Customer save(Customer customer);

	Customer update(Integer id, Customer customer);

	Customer delete(Integer id);

	List<Customer> findCustomerByName(String name);

}
