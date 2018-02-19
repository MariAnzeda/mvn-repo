package com.univ.univ.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Service;
import com.univ.univ.Dto.DoAssignmentDto;
import com.univ.univ.entity.DoAssignment;
import com.univ.univ.service.DoAssignmentService;

@Service
public class DoAssignmentServiceImpl implements DoAssignmentService{
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<DoAssignmentDto> assignmentDone() {
		CriteriaBuilder crit = em.getCriteriaBuilder();
		CriteriaQuery<DoAssignment> q = crit.createQuery(DoAssignment.class);
		Root<DoAssignment> root = q.from(DoAssignment.class);
		q.select(root);
		
		TypedQuery<DoAssignment> query = em.createQuery(q);
		List<DoAssignment> list = query.getResultList();
		
		List<DoAssignmentDto> assignmentsDone = new ArrayList<>();
		for (DoAssignment results : list) {
			DoAssignmentDto e= new DoAssignmentDto(results.getStudent().getName(),
				                                    results.getAssignment().getSubject().getName(),
				                                    results.getAssignment().getDescription(),
				                                    results.getGrade());
			assignmentsDone.add(e);	
		}
		return assignmentsDone;
	}
	
}
