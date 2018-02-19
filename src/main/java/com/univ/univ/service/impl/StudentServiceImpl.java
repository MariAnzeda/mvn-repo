package com.univ.univ.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.univ.univ.Dto.StudentDto;
import com.univ.univ.entity.Student;
import com.univ.univ.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<StudentDto> findStudent(){
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Student> q = cb.createQuery(Student.class);
		Root<Student> root = q.from(Student.class);
		//q.where(cb.equal(root.get("username"), "mari"),
		 q.where(
	        cb.gt(root.get("id"), 3),
	        cb.lt(root.get("id"), 5));
	
		q.select(root);
		  
		TypedQuery<Student> query = em.createQuery(q);
		List<Student> results = query.getResultList();
		
		List<StudentDto> list= new ArrayList<>();
		for(Student lista : results) {
			StudentDto e = new StudentDto(lista.getId(), lista.getUsername(), lista.getName(),lista.getSurname());
			list.add(e);
			}
	return list;
		}
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

}
