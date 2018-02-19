package com.univ.univ.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String name;

	private String surname;

	private String username;

	//bi-directional many-to-one association to DoAssignment
	@OneToMany(mappedBy="student")
	private List<DoAssignment> doAssignments;

	public Student() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<DoAssignment> getDoAssignments() {
		return this.doAssignments;
	}

	public void setDoAssignments(List<DoAssignment> doAssignments) {
		this.doAssignments = doAssignments;
	}

	public DoAssignment addDoAssignment(DoAssignment doAssignment) {
		getDoAssignments().add(doAssignment);
		doAssignment.setStudent(this);

		return doAssignment;
	}

	public DoAssignment removeDoAssignment(DoAssignment doAssignment) {
		getDoAssignments().remove(doAssignment);
		doAssignment.setStudent(null);

		return doAssignment;
	}

}