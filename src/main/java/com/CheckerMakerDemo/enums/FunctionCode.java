package com.CheckerMakerDemo.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
//@AllArgsConstructor
//@Setter
public enum FunctionCode {

	REFERENCE_MAINTAINANCE("Referance maintainance"),
	
	ONBOARDING_REIVIEW("Onboardind Review"),
	
	CUSTOMER_UNLOCK("Costomer Unlock ");
	
	private String value;
	
	FunctionCode(String string) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		
		return value;
	}
	
	
	
	
}
