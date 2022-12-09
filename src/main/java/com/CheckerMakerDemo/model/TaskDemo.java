package com.CheckerMakerDemo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.CheckerMakerDemo.enums.ApprovalStatus;
import com.CheckerMakerDemo.enums.FunctionCode;
import com.CheckerMakerDemo.enums.RequestActionCode;
import com.CheckerMakerDemo.enums.TaskAction;

import lombok.Data;

//import co.boost.bank.common.model.persistence.BaseEntity;

@Entity
@Data
public class TaskDemo  {
	
	public TaskDemo(String id, FunctionCode functionCode, String functionName, LocalDateTime requestAt,
			String requestReferenace, RequestActionCode requestActionCode, String makerId, String makerName,
			String makerEmail, String makerComments, String lastActionUserId, String lastActionUserNamel,
			TaskAction taskAction, LocalDateTime lastActionAt, String lastActionComments, Integer approverCount,
			Integer approvalCounter, ApprovalStatus approvalStatus, String requestId, String preChangeDetail,
			String requestDetails) {
		super();
		this.id = id;
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.requestAt = requestAt;
		this.requestReferenace = requestReferenace;
		this.requestActionCode = requestActionCode;
		this.makerId = makerId;
		this.makerName = makerName;
		this.makerEmail = makerEmail;
		this.makerComments = makerComments;
		this.lastActionUserId = lastActionUserId;
		this.lastActionUserNamel = lastActionUserNamel;
		this.taskAction = taskAction;
		this.lastActionAt = lastActionAt;
		this.lastActionComments = lastActionComments;
		this.approverCount = approverCount;
		this.approvalCounter = approvalCounter;
		this.approvalStatus = approvalStatus;
		this.requestId = requestId;
		this.preChangeDetail = preChangeDetail;
		this.requestDetails = requestDetails;
	}

	public TaskDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

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

	public LocalDateTime getRequestAt() {
		return requestAt;
	}

	public void setRequestAt(LocalDateTime requestAt) {
		this.requestAt = requestAt;
	}

	public String getRequestReferenace() {
		return requestReferenace;
	}

	public void setRequestReferenace(String requestReferenace) {
		this.requestReferenace = requestReferenace;
	}

	public RequestActionCode getRequestActionCode() {
		return requestActionCode;
	}

	public void setRequestActionCode(RequestActionCode requestActionCode) {
		this.requestActionCode = requestActionCode;
	}

	public String getMakerId() {
		return makerId;
	}

	public void setMakerId(String makerId) {
		this.makerId = makerId;
	}

	public String getMakerName() {
		return makerName;
	}

	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}

	public String getMakerEmail() {
		return makerEmail;
	}

	public void setMakerEmail(String makerEmail) {
		this.makerEmail = makerEmail;
	}

	public String getMakerComments() {
		return makerComments;
	}

	public void setMakerComments(String makerComments) {
		this.makerComments = makerComments;
	}

	public String getLastActionUserId() {
		return lastActionUserId;
	}

	public void setLastActionUserId(String lastActionUserId) {
		this.lastActionUserId = lastActionUserId;
	}

	public String getLastActionUserNamel() {
		return lastActionUserNamel;
	}

	public void setLastActionUserNamel(String lastActionUserNamel) {
		this.lastActionUserNamel = lastActionUserNamel;
	}

	public TaskAction getTaskAction() {
		return taskAction;
	}

	public void setTaskAction(TaskAction taskAction) {
		this.taskAction = taskAction;
	}

	public LocalDateTime getLastActionAt() {
		return lastActionAt;
	}

	public void setLastActionAt(LocalDateTime lastActionAt) {
		this.lastActionAt = lastActionAt;
	}

	public String getLastActionComments() {
		return lastActionComments;
	}

	public void setLastActionComments(String lastActionComments) {
		this.lastActionComments = lastActionComments;
	}

	public Integer getApproverCount() {
		return approverCount;
	}

	public void setApproverCount(Integer approverCount) {
		this.approverCount = approverCount;
	}

	public Integer getApprovalCounter() {
		return approvalCounter;
	}

	public void setApprovalCounter(Integer approvalCounter) {
		this.approvalCounter = approvalCounter;
	}

	public ApprovalStatus getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(ApprovalStatus approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPreChangeDetail() {
		return preChangeDetail;
	}

	public void setPreChangeDetail(String preChangeDetail) {
		this.preChangeDetail = preChangeDetail;
	}

	public String getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(String requestDetails) {
		this.requestDetails = requestDetails;
	}


	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "function_code")
	private FunctionCode functionCode;
	
	@Column(name = "function_name")
	private String functionName;
	
	@Column(name = "request_at")
	private LocalDateTime requestAt;
	
	
	@Column(name = "request_referenace")
	private String requestReferenace;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "request_action_code")
	private RequestActionCode requestActionCode;
	
	@Column(name = "maker_id")
	private String makerId;
	
	
	@Column(name = "maker_name")
	private String makerName;
	
	@Column(name = "maker_email")
	private String makerEmail;
	
	@Column(name = "maker_comments")
	private String makerComments;
	
	@Column(name = "last_action_user_id")
	private String lastActionUserId;
	
	@Column(name = "last_action_user_name")
	private String lastActionUserNamel;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "task_ation")
	private TaskAction taskAction;
	
	@Column(name = "last_action_at")
	private LocalDateTime lastActionAt;
	
	@Column(name = "last_action_comments")
	private String lastActionComments;
	
	//@Builder.Default
	@Column(name = "approver_cout")
	private Integer approverCount=1;
	
	//@Builder.Default
	@Column(name = "approval_counter")
	private Integer approvalCounter=0;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "approval_status")
	private ApprovalStatus approvalStatus;
	
	@Column(name = "request_id")
	private String requestId;
	
	@Column(name = "pre_change_detail")
	private String preChangeDetail;
	
	@Column(name = "request_details")
	private String requestDetails;
	
	
	
	
	
	
	
	
	
	
	

}
