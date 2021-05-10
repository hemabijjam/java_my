package com.springboot.learnspringboot.corses.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//(name="my_table")
public class Course {
	@Id
	@GeneratedValue
	//@Column(name="course_id")
	private long id;
	//@Column(name="course_name")
	private String name;
	private String autour;
	public Course() {
		
	}
	public Course(long id, String name, String autour) {
		super();
		this.id = id;
		this.name = name;
		this.autour = autour;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAutour() {
		return autour;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", autour=" + autour + "]";
	}
	

}
