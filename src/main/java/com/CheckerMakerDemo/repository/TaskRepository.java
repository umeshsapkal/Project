package com.CheckerMakerDemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CheckerMakerDemo.model.TaskDemo;

@Repository
public interface TaskRepository extends JpaRepository<TaskDemo, String> {

	

}
