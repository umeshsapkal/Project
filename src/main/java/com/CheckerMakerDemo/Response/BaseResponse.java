

package com.CheckerMakerDemo.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.v3.oas.annotations.media.Schema;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResponse {

	public BaseResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Schema(description = "The service that is responding", example = "checker-maker")
	private String contex;
	
	@Schema(description = "The service defined error code", example = "1004")
	private String coode;
	
	private String message;

	public BaseResponse(String contex, String coode, String message) {
		super();
		this.contex = contex;
		this.coode = coode;
		this.message = message;
	}

	public String getContex() {
		return contex;
	}

	public void setContex(String contex) {
		this.contex = contex;
	}

	public String getCoode() {
		return coode;
	}

	public void setCoode(String coode) {
		this.coode = coode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
