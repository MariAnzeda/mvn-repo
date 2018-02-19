package com.univ.univ.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.univ.univ.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {
	@Query
	("SELECT s FROM Student s")
	List<Student> stampaStudent();
}