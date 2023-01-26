package com.edj.codefest.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired 
	private AddressRepository addressRepository;
	 
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer retrieveCustomerDetails(String customerId) {
		
		return customerRepository.findByCustomerId(customerId);
	}
	
	public Address retrieveAddressDetails(String addressId) {
		
		return addressRepository.findByAddressId(addressId);
	}

}
