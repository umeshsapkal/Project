package com.CheckerMakerDemo.dto;

import com.CheckerMakerDemo.enums.FunctionCode;

public class TaskDto {

	private String id;

	private FunctionCode functionCode;

	private String functionName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FunctionCode getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(FunctionCode functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public TaskDto(String id, FunctionCode functionCode, String functionName) {
		super();
		this.id = id;
		this.functionCode = functionCode;
		this.functionName = functionName;
	}

	public TaskDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

//	private String requestReferenace;
//
//	private RequestActionCode requestActionCode;
//
//	private String makerId;
//
//	private String makerName;
//
//	private String makerEmail;
//
//	private String makerComments;
//
//	private String lastActionUserId;
//
//	private String lastActionUserNamel;
	

}
