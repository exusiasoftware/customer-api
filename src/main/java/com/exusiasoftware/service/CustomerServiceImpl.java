package com.exusiasoftware.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exusiasoftware.model.Customer;
import com.exusiasoftware.service.CustomerDataStub;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> getAllCustomers() {
		return CustomerDataStub.getAllCustomers();
	}

	@Override
	public Customer getCustomer(Integer id) {
		return CustomerDataStub.getCustomer(id);
	}

	@Override
	public Customer save(Customer customer) {
		return CustomerDataStub.save(customer);
	}

	@Override
	public Customer update(Integer id, Customer customer) {
		return CustomerDataStub.update(id, customer);
	}

	@Override
	public Customer delete(Integer id) {
		return CustomerDataStub.delete(id);
	}

	@Override
	public List<Customer> findCustomerByName(String name) {
		return CustomerDataStub.findCustomerByName(name);
	}

}









