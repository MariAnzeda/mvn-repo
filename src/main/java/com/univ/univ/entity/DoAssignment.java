package com.univ.univ.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the do_assignment database table.
 * 
 */
@Entity
@Table(name="do_assignment")
@NamedQuery(name="DoAssignment.findAll", query="SELECT d FROM DoAssignment d")
public class DoAssignment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DoAssignmentPK id;

	@Temporal(TemporalType.DATE)
	private Date date;

	private int grade;

	//bi-directional many-to-one association to Assignment
	@ManyToOne
	@JoinColumn(name="id_assignment",insertable=false, updatable=false)
	private Assignment assignment;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="id_student",insertable=false, updatable=false)
	private Student student;

	public DoAssignment() {
	}

	public DoAssignmentPK getId() {
		return this.id;
	}

	public void setId(DoAssignmentPK id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Assignment getAssignment() {
		return this.assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}