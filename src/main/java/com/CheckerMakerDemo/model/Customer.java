package com.CheckerMakerDemo.model;

public class Customer {
	
	private String id;
	
	private String cust_id;
	
	private String cuct_name;
	
	private String cust_code;
	
	private String date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getCuct_name() {
		return cuct_name;
	}

	public void setCuct_name(String cuct_name) {
		this.cuct_name = cuct_name;
	}

	public String getCust_code() {
		return cust_code;
	}

	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer(String id, String cust_id, String cuct_name, String cust_code, String date) {
		super();
		this.id = id;
		this.cust_id = cust_id;
		this.cuct_name = cuct_name;
		this.cust_code = cust_code;
		this.date = date;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
