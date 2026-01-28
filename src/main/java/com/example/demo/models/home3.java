package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class home3 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	@OneToOne(cascade =CascadeType.ALL )
	private home4 home4;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public home4 getHome4() {
		return home4;
	}
	public void setHome4(home4 home4) {
		this.home4 = home4;
	}
	public home3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public home3(Integer id, String title, String description, com.example.demo.models.home4 home4) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.home4 = home4;
	}
	
	

}
