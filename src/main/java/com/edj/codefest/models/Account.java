package com.edj.codefest.models;

import java.io.Serializable;

public class Account implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String acctNo;
	private String acctName;
	private String acctType;
	private String countryCd;
	
	
	
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getCountryCd() {
		return countryCd;
	}
	public void setCountryCd(String countryCd) {
		this.countryCd = countryCd;
	}
	
	

}
