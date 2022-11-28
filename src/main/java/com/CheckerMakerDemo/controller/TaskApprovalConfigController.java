package com.CheckerMakerDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CheckerMakerDemo.Response.BaseResponse;
import com.CheckerMakerDemo.enums.FunctionCode;
import com.CheckerMakerDemo.model.Customer;
import com.CheckerMakerDemo.model.TaskApprovalConfigDemo;
import com.CheckerMakerDemo.service.TaskApprovalConfigService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController

@RequestMapping("/approval")
public class TaskApprovalConfigController {
	
	@Autowired
	private TaskApprovalConfigService taskApprovalConfigService;

	
	@Operation(summary = "Get Nad Proxy List")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully Created Task Approval Configuration", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Missing required parameters", content = @Content) })

	
	@PostMapping("/createTaskApproval")
	public TaskApprovalConfigDemo createTaskApprovalConfig(@RequestBody TaskApprovalConfigDemo taskApprovalConfig) {
		
		
		return taskApprovalConfigService.createApprovalConfig(taskApprovalConfig);
		
	}
	
	
	@Operation(summary = "Get Nad Proxy List")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully Delete Approval Configuration", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Missing required parameters", content = @Content) })

	
	@DeleteMapping("/deleteApproval/{id}")
	public void deleteById(@PathVariable String id ) {
		
		taskApprovalConfigService.deleteById(id);
	}
	
	
	@Operation(summary = "Get Nad Proxy List")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully get Approval By Id", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Missing required parameters", content = @Content) })

	
	
	@GetMapping("/byIdApproval/{approvalCount}")
	public Optional<TaskApprovalConfigDemo> getById(@RequestParam String id,@PathVariable Integer approvalCount) {
		
	
	//System.out.println("************************"+ approvalCount);
		
		return taskApprovalConfigService.findByIdApprovalConfig(id);
	}
	
	
	@Operation(summary = "Get Nad Proxy List")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully get All Approval Configuration", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Missing required parameters", content = @Content) })

	
		@GetMapping("/getAll")
	
	      public List<TaskApprovalConfigDemo> getAllApprovalConfiguration(){
		
		  return taskApprovalConfigService.getAllAprovalConfiguration();
	}
	
	
	
	@GetMapping("/getByFunctionCode/{functionCode}")
	public List<TaskApprovalConfigDemo> getApprovalConfigurationByFunctionCode(@PathVariable String functionCode) {
		
		
		
		return taskApprovalConfigService.findByFunctionCode(FunctionCode.valueOf(functionCode));
	}
	
	
	 
	
	
}
