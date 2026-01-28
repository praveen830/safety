package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class home6 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String descrpition;
	private String img1;
	private String src1;
	private String img2;
	private String src2;
	private String img3;
	private String src3;
	private String title1;
	private String descrpition1;
	private String title2;
	private String descrpition2;
	private String title3;
	private String descrpition3;
	private String fotter;
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
	public String getDescrpition() {
		return descrpition;
	}
	public void setDescrpition(String descrpition) {
		this.descrpition = descrpition;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getSrc1() {
		return src1;
	}
	public void setSrc1(String src1) {
		this.src1 = src1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getSrc2() {
		return src2;
	}
	public void setSrc2(String src2) {
		this.src2 = src2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	public String getSrc3() {
		return src3;
	}
	public void setSrc3(String src3) {
		this.src3 = src3;
	}
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getDescrpition1() {
		return descrpition1;
	}
	public void setDescrpition1(String descrpition1) {
		this.descrpition1 = descrpition1;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getDescrpition2() {
		return descrpition2;
	}
	public void setDescrpition2(String descrpition2) {
		this.descrpition2 = descrpition2;
	}
	public String getTitle3() {
		return title3;
	}
	public void setTitle3(String title3) {
		this.title3 = title3;
	}
	public String getDescrpition3() {
		return descrpition3;
	}
	public void setDescrpition3(String descrpition3) {
		this.descrpition3 = descrpition3;
	}
	public String getFotter() {
		return fotter;
	}
	public void setFotter(String fotter) {
		this.fotter = fotter;
	}
	public home6() {
		super();
		// TODO Auto-generated constructor stub
	}
	public home6(Integer id, String title, String descrpition, String img1, String src1, String img2, String src2,
			String img3, String src3, String title1, String descrpition1, String title2, String descrpition2,
			String title3, String descrpition3, String fotter) {
		super();
		this.id = id;
		this.title = title;
		this.descrpition = descrpition;
		this.img1 = img1;
		this.src1 = src1;
		this.img2 = img2;
		this.src2 = src2;
		this.img3 = img3;
		this.src3 = src3;
		this.title1 = title1;
		this.descrpition1 = descrpition1;
		this.title2 = title2;
		this.descrpition2 = descrpition2;
		this.title3 = title3;
		this.descrpition3 = descrpition3;
		this.fotter = fotter;
	}
	

}
