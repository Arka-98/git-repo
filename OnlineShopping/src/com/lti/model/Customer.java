package com.lti.model;

public class Customer {

	private int custId;
	private String custName;
	private int custPhone;
	public Customer() {
		
	}
	
	public int getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(int custPhone) {
		this.custPhone = custPhone;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
}
