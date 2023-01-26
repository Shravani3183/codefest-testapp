package com.edj.codefest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edj.codefest.database.Customer;
import com.edj.codefest.database.CustomerService;
import com.edj.codefest.models.Account;

@CrossOrigin(
		origins= {
			"http://loalhost:8080",
			"http://loalhost:3000"
		},
		allowedHeaders="*",
		allowCredentials="true")

@RestController
public class TestDemoController {
	
	
	@Autowired
	private CustomerService service;
	
	
	 @GetMapping("accounts/{customerId}")
	public HttpEntity<Account> getAccount(@PathVariable String customerId) throws Exception {
		 
		/*
		 * Customer cust = service.retrieveCustomerDetails(customerId);
		 * 
		 * System.out.println(cust.getAddressId());
		 * System.out.println(cust.getCustomerId());
		 */
		 
		 try {
			if(customerId == null) {
				 throw new NullPointerException();
			 }
			 
			 if(customerId.length() != 8) {
				 throw new RuntimeException("Validation Exception");
			 }
			 
			 if(customerId.equals("12345678")) {
				 throw new RuntimeException("No Data found for the account");
			 }
			 
			 Account acct = new Account();
			 
			 acct.setAcctNo(customerId);
			 acct.setAcctName("Test Account");
			 acct.setAcctType("Individual");
			 acct.setCountryCd("US");
			 
			 
			 return new ResponseEntity<>(acct, HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception(e);
		}
	   
	  }
	 
	 @GetMapping("test")
		public String triggerException() {
		 
		 
			 
			throw new RuntimeException("Custom Exception");
		   
		  }
	
}
