package com.CheckerMakerDemo.repository;

  
  import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CheckerMakerDemo.enums.FunctionCode;
import com.CheckerMakerDemo.model.TaskApprovalConfigDemo;
  
  public interface ApprovalConfigRepository extends JpaRepository<TaskApprovalConfigDemo,
  String> {
  
	  //Optional<TaskApprovalConfigDemo> getByfunctioCode(FunctionCode functioncode)
	 // String hql=("select ta.id,ta.functionCode,ta.functionName,ta.approvalCount from TaskApprovalConfigDemo ta where ta.functionCode=?");
	      
        //HQL   
	    @Query(value = "SELECT t FROM TaskApprovalConfigDemo t where t.functionCode= ?1 ")
         List<TaskApprovalConfigDemo> getByFunctionCode(FunctionCode functionCode);
	  
  }