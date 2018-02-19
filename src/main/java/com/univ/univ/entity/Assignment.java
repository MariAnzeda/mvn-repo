package com.univ.univ.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the assignment database table.
 * 
 */
@Entity
@NamedQuery(name="Assignment.findAll", query="SELECT a FROM Assignment a")
public class Assignment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String description;

	//bi-directional many-to-one association to Subject
	@ManyToOne
	@JoinColumn(name="id_subject")
	private Subject subject;

	//bi-directional many-to-one association to DoAssignment
	@OneToMany(mappedBy="assignment")
	private List<DoAssignment> doAssignments;

	public Assignment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Subject getSubject() {
		return this.subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public List<DoAssignment> getDoAssignments() {
		return this.doAssignments;
	}

	public void setDoAssignments(List<DoAssignment> doAssignments) {
		this.doAssignments = doAssignments;
	}

	public DoAssignment addDoAssignment(DoAssignment doAssignment) {
		getDoAssignments().add(doAssignment);
		doAssignment.setAssignment(this);

		return doAssignment;
	}

	public DoAssignment removeDoAssignment(DoAssignment doAssignment) {
		getDoAssignments().remove(doAssignment);
		doAssignment.setAssignment(null);

		return doAssignment;
	}

}