package com.xworkz.actormovie.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "actor")
public class ActorDTO implements Serializable{
	@Id
	@GenericGenerator(name="cherry",strategy="increment")
	@GeneratedValue(generator="cherry")
	@Column(name="AC_ID")
	private int id;
	@Column(name="AC_NAME")
	private String name;
	@Column(name = "AC_LANG")
	private String lang;
	@Column(name="AC_SALARY")
	private float salary;
	
	public ActorDTO(){
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	
	

	public ActorDTO(String name, String lang, float salary) {
		super();
		this.name = name;
		this.lang = lang;
		this.salary = salary;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "ActorDTO [id=" + id + ", name=" + name + ", lang=" + lang + ", salary=" + salary + "]";
	}
	
	
	
	
}
