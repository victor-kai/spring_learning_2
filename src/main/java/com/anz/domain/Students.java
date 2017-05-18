package com.anz.domain;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {

	@Id
	@GeneratedValue
	private int id;
	private String sex;
	private int age;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
