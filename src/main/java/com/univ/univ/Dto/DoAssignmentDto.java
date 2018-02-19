package com.univ.univ.Dto;

import com.univ.univ.entity.Assignment;
import com.univ.univ.entity.DoAssignment;

public class DoAssignmentDto {
	private String studentName;
	private String subjectName;
	private String description;
	private int grade;
	
	public DoAssignmentDto() {
		super();
	}
	
	public DoAssignmentDto(String studentName,String subjectName, String description,int grade) {
		this.studentName= studentName;
		this.subjectName= subjectName;
		this.description= description;
		this.grade= grade;
	}
	
	public DoAssignmentDto( DoAssignment doAssignmentDto) {
		this.studentName= doAssignmentDto.getStudent().getName();
		this.grade= doAssignmentDto.getGrade();
	}
	public DoAssignmentDto( Assignment doAssignmentDto) {
		this.subjectName= doAssignmentDto.getSubject().getName();
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
