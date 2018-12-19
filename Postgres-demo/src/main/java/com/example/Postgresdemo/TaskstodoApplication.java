package com.example.Postgresdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TaskstodoApplication {
	
	public static void main(String[] args) { 
		SpringApplication.run(TaskstodoApplication.class, args);

}
}
