
CREATE TABLE task_demo (
  id varchar(64) NOT NULL,
  function_code varchar(20),
  function_name varchar(20),
  request_at timestamp(3) NOT NULL DEFAULT current_timestamp(3),
  request_referenace varchar(18) NOT NULL,
  request_action_code datetime NOT NULL,
  maker_id varchar(64) NOT NULL,
  maker_name varchar(20) NOT NULL,
  maker_email varchar(64) NOT NULL,
  maker_comments varchar(32) NOT NULL,
  last_action_user_id varchar(4000) NULL,
  last_action_user_name varchar(64) NULL,
  task_ation varchar(32) NULL,
  last_action_at timestamp(3) NOT NULL DEFAULT current_timestamp(3),
  last_action_comments varchar(30) NULL,
  approver_cout INT2 NULL,
  approval_counter  INT2  NULL,
  approval_status varchar(20)  NULL,
  request_id varchar(10) NOT NULL,
  pre_change_detail varchar(64),
  request_details varchar(20)
  );
  
