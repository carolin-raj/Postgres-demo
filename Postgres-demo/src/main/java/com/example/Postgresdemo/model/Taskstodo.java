package com.example.Postgresdemo.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.scheduling.config.Task;

    @Entity
	@Table(name= "Taskstodos")
	@EntityListeners(AuditingEntityListener.class) 


	public class Taskstodo {
		@Id  
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		

		@NotBlank
		private String assignee;
		
		
		@NotBlank
		private String task;
		
		@Temporal(TemporalType.TIMESTAMP)
		@LastModifiedDate
		private Date createdAt;
		
		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getAssignee() {
			return assignee;
		}


		public void setAssignee(String assignee) {
			this.assignee = assignee;
		}


		public String getTask() {
			return task;
		}


		public void setTask(String task) {
			this.task = task;
		}


		public Date getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}


		public static List<Task> findAllTasks() {
			// TODO Auto-generated method stub
			return null;
		}


		

		
		}


