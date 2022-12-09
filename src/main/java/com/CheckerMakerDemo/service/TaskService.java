package com.CheckerMakerDemo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CheckerMakerDemo.dto.TaskDto;
import com.CheckerMakerDemo.model.TaskDemo;
//import com.CheckerMakerDemo.repository.ApprovalConfigRepository;
import com.CheckerMakerDemo.repository.TaskRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TaskService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private TaskRepository taskRepository;
//	@Autowired
//	private ApprovalConfigRepository approvalConfigRepository;

	public Optional<TaskDemo> findByTaskId(String id) {

		return taskRepository.findById(id);

	}

	public TaskDemo createTask(TaskDemo taskDemo) {

		
		return taskRepository.save(taskDemo);

	}
	
	public void deleteById(String id) {                        
		
		taskRepository.deleteById(id);
	}
	
	public List<TaskDemo> getAllTask(){  
		  
		return taskRepository.findAll();
	}
	
	public List<TaskDto> getAllTaskDto(){
		return taskRepository.findAll().stream().map(p->modelMapper.map(p, TaskDto.class)).collect(Collectors.toList());
	}
	
	public TaskDemo getDtoUpdate(String id,TaskDto taskDto){
		TaskDemo taskDemo= taskRepository.findById(id).get();//orElseThrow(() -> new ResourceNotFoundException("taskDemo", "id", id));
		
		taskDemo. setFunctionCode(taskDto.getFunctionCode());
		taskDemo. setFunctionName(taskDto.getFunctionName());
		
		return taskRepository.save(taskDemo); 
		
		
	}
	
	public void deleteDto(String id) {
		taskRepository.deleteById(id);
	}

}
