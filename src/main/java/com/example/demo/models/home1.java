package com.example.demo.models;





import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class home1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String descripition;
	@OneToOne (cascade = CascadeType.ALL) 
	private home2 home2;
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
	public String getDescripition() {
		return descripition;
	}
	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}
	public home2 getHome2() {
		return home2;
	}
	public void setHome2(home2 home2) {
		this.home2 = home2;
	}
	public home1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public home1(Integer id, String title, String descripition, com.example.demo.models.home2 home2) {
		super();
		this.id = id;
		this.title = title;
		this.descripition = descripition;
		this.home2 = home2;
	}
}