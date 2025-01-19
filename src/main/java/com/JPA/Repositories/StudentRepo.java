package com.JPA.Repositories;

import com.JPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
//    here we need not implement generic methods like findAll save etc. these will be handled
//    if we have something too specific we can always go ahead and create methods.
//    @Query("select s from Student s where name= ?1") // we need to mention Student as class and object s from it
//    The query written above is also unnecessary as JPA has DSL domain specific language even if the queries are not present but if they are related to variables/properties of the entity then they willl be created.
    List<Student> findByName(String name);
//    And also if the method name makes sense and uses common sense
    List<Student> findByAgeGreaterThan(int age);


}
