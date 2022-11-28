package com.CheckerMakerDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CheckerMakerDemo.model.TaskDemo;
//import com.CheckerMakerDemo.repository.ApprovalConfigRepository;
import com.CheckerMakerDemo.repository.TaskRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TaskService {
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

}
