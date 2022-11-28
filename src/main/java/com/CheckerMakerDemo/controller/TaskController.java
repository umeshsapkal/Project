package com.CheckerMakerDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CheckerMakerDemo.Response.BaseResponse;
import com.CheckerMakerDemo.model.TaskDemo;
import com.CheckerMakerDemo.service.TaskService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@Operation(summary = "Get Nad Proxy List")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully Created Task", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class)) }),
			@ApiResponse(responseCode = "400", description = "Missing required parameters", content = @Content) })

	@PostMapping("/create")
	public TaskDemo createTask(TaskDemo taskDemo) {

		return taskService.createTask(taskDemo);
	}
	
	
	@GetMapping("/gettask/{id}")
	
	  public Optional<TaskDemo> getTaskById(@PathVariable  String id) {
		
		return taskService.findByTaskId(id);  
	}
	
	
			 @DeleteMapping("/delete/{id}")
	         public void deleteTaskById(@PathVariable String id ) {
		
		     		taskService.deleteById(id); 
		   			
		
	}			
			
			@GetMapping("/getAllTask")
			public List<TaskDemo> getAllTask(){
				
				return taskService.getAllTask();
			}
			

}
