package com.xworkz.actormovie.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movie")
public class MovieDTO implements Serializable{
	@Id
	@GenericGenerator(name="cherry",strategy="increment")
	@GeneratedValue(generator="cherry")
	@Column(name="MO_ID")
	private int id;
	@Column(name="MO_NAME")
	private String name;
	@Column(name = "MO_LANG")
	private String lang;
	@Column(name="MO_CAST")
	private int noOfCast;
	
	public MovieDTO(){
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	
	

	public MovieDTO(String name, String lang, int noOfCast ) {
		super();
		this.name = name;
		this.lang = lang;
		this.noOfCast = noOfCast;
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

	public float getNoOfCast() {
		return noOfCast;
	}

	public void setNoOfCast(int noOfCast) {
		this.noOfCast = noOfCast;
	}




	@Override
	public String toString() {
		return "ActorDTO [id=" + id + ", name=" + name + ", lang=" + lang + ", noOfCast=" + noOfCast + "]";
	}
	
	
	
	
}
