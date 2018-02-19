package com.univ.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.univ.univ.Dto.DoAssignmentDto;
import com.univ.univ.Dto.StudentDto;
import com.univ.univ.entity.DoAssignment;
import com.univ.univ.service.DoAssignmentService;
import com.univ.univ.service.StudentService;

@RestController
public class UnivController {
//	@Autowired
//	private StudentService studentService;
//	@RequestMapping
//	(value = "/student", produces= {"application/json"}, method = RequestMethod.GET)
//	public ResponseEntity<List<StudentDto>> formModelSerieCodeGet(){
//		List<StudentDto> list =  studentService.findStudent();
//		return new ResponseEntity<List<StudentDto>> (list,HttpStatus.OK);	
	
	@Autowired
    private DoAssignmentService doassignmentService;
	@RequestMapping
	(value = "/doassignment", produces= {"application/json"}, method = RequestMethod.GET)
	public ResponseEntity<List<DoAssignmentDto>> formModelSerieCodeGet(){
		List<DoAssignmentDto> list = doassignmentService.assignmentDone();
		return new ResponseEntity<List<DoAssignmentDto>> (list, HttpStatus.OK);	
	} 
	
	

	public UnivController() {
		// TODO Auto-generated constructor stub
	}

}
