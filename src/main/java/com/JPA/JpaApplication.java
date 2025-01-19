package com.JPA;

import com.JPA.Repositories.StudentRepo;
import com.JPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = context.getBean(Student.class);
		s1.setAge(18);
		s1.setName("Sagar");
		s1.setRollNo(1);
		repo.save(s1); // now this along with many other methods are already available in jparepository we need not bother to implement basic one's and we can focus on the specific one's our application needs.

		Student s2 = context.getBean(Student.class);
		s2.setAge(19);
		s2.setName("Akshata");
		s2.setRollNo(2);
		repo.save(s2); // now this along with many other methods are already available in jparepository we need not bother to implement basic one's and we can focus on the specific one's our application needs.
		System.out.println(repo.findAll());

		Optional<Student> s3 = repo.findById(105); // for many methods like this one we need to write Optional because they return Optional<T> why because we might ask for data which is not there at all and in that case.
//		we'll get null in return and these might lead to null pointer exceptions.which are not good
		System.out.println(repo.findByName("Sagar")); // now for the methods which don't exist already. we need to implement as we did.
		System.out.println(repo.findByAgeGreaterThan(18));
	}

}
