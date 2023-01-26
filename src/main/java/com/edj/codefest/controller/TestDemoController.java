package com.edj.codefest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edj.codefest.database.AddressRepository;
import com.edj.codefest.database.Customer;
import com.edj.codefest.database.CustomerRepository;
import com.edj.codefest.database.CustomerService;
import com.edj.codefest.models.Account;

@RestController
public class TestDemoController {
	
	
<<<<<<< HEAD
	@Autowired
	private CustomerService service;
	
	
	 @GetMapping("accounts/{customerId}")
	public HttpEntity<Account> getAccount(@PathVariable String customerId) {
		 
		 Customer cust = service.retrieveCustomerDetails(customerId);
		 
		 System.out.println(cust.getAddressId());
		 System.out.println(cust.getCustomerId());
=======
	@GetMapping("accounts/{acctId}")
	public HttpEntity<Account> getAccount(@PathVariable Long acctId) {
>>>>>>> branch 'main' of https://github.com/Shravani3183/codefest-testapp.git
		 
		 Account acct = new Account();
		 
		 acct.setAcctId("123456789");
		 acct.setAcctName("Shravani");
	     acct.setAcctType("Single-Individual");
	     
	     return new ResponseEntity<>(acct, HttpStatus.OK);
	   
	  }
	 
	 @GetMapping("test")
		public String triggerException() {
		 
		 
			 
			throw new RuntimeException("Custom Exception");
		   
		  }
	
}
