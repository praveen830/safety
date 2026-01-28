package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class home {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String descrption;
	private String checkbox1;
	private String checkbox2;
	private String src;
	private String alt;
	private String src2;
	private String alt2;
	private String src3;
	private String alt3;
	private String src4;
	private String alt4;
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
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
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
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getSrc2() {
		return src2;
	}
	public void setSrc2(String src2) {
		this.src2 = src2;
	}
	public String getAlt2() {
		return alt2;
	}
	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}
	public String getSrc3() {
		return src3;
	}
	public void setSrc3(String src3) {
		this.src3 = src3;
	}
	public String getAlt3() {
		return alt3;
	}
	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}
	public String getSrc4() {
		return src4;
	}
	public void setSrc4(String src4) {
		this.src4 = src4;
	}
	public String getAlt4() {
		return alt4;
	}
	public void setAlt4(String alt4) {
		this.alt4 = alt4;
	}
	public home() {
		super();
		// TODO Auto-generated constructor stub
	}
	public home(Integer id, String title, String descrption, String checkbox1, String checkbox2, String src, String alt,
			String src2, String alt2, String src3, String alt3, String src4, String alt4) {
		super();
		this.id = id;
		this.title = title;
		this.descrption = descrption;
		this.checkbox1 = checkbox1;
		this.checkbox2 = checkbox2;
		this.src = src;
		this.alt = alt;
		this.src2 = src2;
		this.alt2 = alt2;
		this.src3 = src3;
		this.alt3 = alt3;
		this.src4 = src4;
		this.alt4 = alt4;
	}
	
	

}
