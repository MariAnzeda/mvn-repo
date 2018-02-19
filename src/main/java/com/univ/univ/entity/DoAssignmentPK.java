package com.univ.univ.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the do_assignment database table.
 * 
 */
@Embeddable
public class DoAssignmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	@Column(name="id_student", insertable=false, updatable=false)
	private int idStudent;

	@Column(name="id_assignment", insertable=false, updatable=false)
	private int idAssignment;

	public DoAssignmentPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdStudent() {
		return this.idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public int getIdAssignment() {
		return this.idAssignment;
	}
	public void setIdAssignment(int idAssignment) {
		this.idAssignment = idAssignment;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DoAssignmentPK)) {
			return false;
		}
		DoAssignmentPK castOther = (DoAssignmentPK)other;
		return 
			(this.id == castOther.id)
			&& (this.idStudent == castOther.idStudent)
			&& (this.idAssignment == castOther.idAssignment);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.idStudent;
		hash = hash * prime + this.idAssignment;
		
		return hash;
	}
}