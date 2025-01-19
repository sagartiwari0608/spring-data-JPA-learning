package com.JPA.Repositories;

import com.JPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
//    here we need not implement generic methods like findAll save etc. these will be handled if we have something too specific we can always go ahead and create methods.
}
