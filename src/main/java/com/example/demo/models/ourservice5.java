package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ourservice5 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String title1;
	private String data;
	private String description;
	private String title2;
	private String data2;
	private String description2;
	private String title3;
	private String data3;
	private String description3;
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
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
	public String getTitle3() {
		return title3;
	}
	public void setTitle3(String title3) {
		this.title3 = title3;
	}
	public String getData3() {
		return data3;
	}
	public void setData3(String data3) {
		this.data3 = data3;
	}
	public String getDescription3() {
		return description3;
	}
	public void setDescription3(String description3) {
		this.description3 = description3;
	}
	public ourservice5() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ourservice5(Integer id, String title, String title1, String data, String description, String title2,
			String data2, String description2, String title3, String data3, String description3) {
		super();
		this.id = id;
		this.title = title;
		this.title1 = title1;
		this.data = data;
		this.description = description;
		this.title2 = title2;
		this.data2 = data2;
		this.description2 = description2;
		this.title3 = title3;
		this.data3 = data3;
		this.description3 = description3;
	}
	
	
	

}
