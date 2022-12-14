package com.CheckerMakerDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.CheckerMakerDemo.enums.FunctionCode;

import lombok.Data;

@Entity
@Data
@Table(name = "task_approval")
public class TaskApprovalConfigDemo {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")

	private String id;

	@Enumerated(EnumType.STRING)
	@Column(name = "function_code")
	private FunctionCode functionCode;
     
	@Column(name = "function_name")
	private String functionName;

	@Column(name = "approval_count")
	private Integer approvalCount;
}