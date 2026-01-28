package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class home5 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private String checkbox1;
	private String checkbox2;
	@OneToOne(cascade = CascadeType.ALL)
	private home6 home6;
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
	public String getCheckbox1() {
		return checkbox1;
	}
	public void setCheckbox1(String checkbox1) {
		this.checkbox1 = checkbox1;
	}
	public String getCheckbox2() {
		return checkbox2;
	}
	public void setCheckbox2(String checkbox2) {
		this.checkbox2 = checkbox2;
	}
	public home6 getHome6() {
		return home6;
	}
	public void setHome6(home6 home6) {
		this.home6 = home6;
	}
	public home5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public home5(Integer id, String title, String description, String checkbox1, String checkbox2,
			com.example.demo.models.home6 home6) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.checkbox1 = checkbox1;
		this.checkbox2 = checkbox2;
		this.home6 = home6;
	}
	

}
