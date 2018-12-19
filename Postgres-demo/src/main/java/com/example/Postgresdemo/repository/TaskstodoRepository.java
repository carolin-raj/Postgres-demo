package com.example.Postgresdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Postgresdemo.model.Taskstodo;



public interface TaskstodoRepository extends JpaRepository<Taskstodo, Long> {

	void deleteById(Optional<Taskstodo> task);
	
}

