package com.CheckerMakerDemo.request;


import com.CheckerMakerDemo.enums.FunctionCode;

import io.swagger.v3.oas.annotations.media.Schema;

public class TaskRequest {
	
	 @Schema(
		      description = "The code of the function where maker actioned on",
		      example = "ONBOARDING_REVIEW")
	 
	 
	 private String id;
	
	 private FunctionCode functionCode;
	 
	 
	 
	 
	 

}
