package com.example.studentDemo;

import com.example.studentDemo.models.Clazz;
import com.example.studentDemo.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductProgramApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ProductProgramApplication.class, args);
	}

}
