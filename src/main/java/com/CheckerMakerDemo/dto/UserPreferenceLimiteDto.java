package com.CheckerMakerDemo.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UserPreferenceLimiteDto {
	

	private Integer id;
	
	private long transationLimitId;
	
	private String customerId;
	
	private Integer amount;

	public UserPreferenceLimiteDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPreferenceLimiteDto(Integer id, long transationLimitId, String customerId, Integer amount) {
		super();
		this.id = id;
		this.transationLimitId = transationLimitId;
		this.customerId = customerId;
		this.amount = amount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public long getTransationLimitId() {
		return transationLimitId;
	}

	public void setTransationLimitId(long transationLimitId) {
		this.transationLimitId = transationLimitId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	

}
