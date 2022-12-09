package com.CheckerMakerDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CheckerMakerDemo.enums.FunctionCode;
import com.CheckerMakerDemo.model.TaskApprovalConfigDemo;
import com.CheckerMakerDemo.repository.ApprovalConfigRepository;

@Service
public class TaskApprovalConfigService {
	
	@Autowired
	private ApprovalConfigRepository approvalConfigRepo;
	
	
	public TaskApprovalConfigDemo createApprovalConfig(TaskApprovalConfigDemo taskApproval) {
		
		
		return approvalConfigRepo.save(taskApproval);
	}
	
	public Optional<TaskApprovalConfigDemo> findByIdApprovalConfig( String id) {
		
		return approvalConfigRepo.findById(id);
	}
	
	 public void deleteById( String id) {
		
		 approvalConfigRepo.deleteById(id);
		 
		
	}
	 
	 public List<TaskApprovalConfigDemo> getAllAprovalConfiguration(){
		 
		 return approvalConfigRepo.findAll();
	 }
	 
	 
	 public List<TaskApprovalConfigDemo> findFuntionByCodeuamesh(FunctionCode functioncode){
		 
		 
		return approvalConfigRepo.getByFunctionCode(functioncode);
		
	 }
	 
	
	
}
