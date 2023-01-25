package com.edj.codefest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edj.codefest.models.Account;

@RestController
public class TestDemoController {
	
	
	 @GetMapping("accounts/{acctId}")
	public HttpEntity<Account> getAccount(@PathVariable Long acctId) {
		 
		 Account acct = new Account();
		 
		 acct.setAcctId("123456789");
		 acct.setAcctName("Shravani");
	     acct.setAcctType("Single-Individual");
	     
	     return new ResponseEntity<>(acct, HttpStatus.OK);
	   
	  }
	
	
	

}
