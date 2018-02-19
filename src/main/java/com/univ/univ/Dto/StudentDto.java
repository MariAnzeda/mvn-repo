package com.univ.univ.Dto;

public class StudentDto {
	private int id;
	private String username;
	private String name;
	private String surname;
	
	public StudentDto() {
		super();
	}
	public StudentDto(int id, String username, String name, String surname) {
		this.id= id;
		this.username= username;
		this.name=name;
		this.setSurname(surname);
		
	}

	public int getId() {
		return id;
		}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
