package com.JPA;

import com.JPA.Repositories.StudentRepo;
import com.JPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		s1.setAge(18);
		s1.setName("Sagar");
		s1.setRollNo(1);
		repo.save(s1);
		System.out.println(repo.findAll());
	}

}
