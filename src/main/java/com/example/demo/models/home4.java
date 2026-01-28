package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class home4 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String img;
	private String src;
	private String title;
	private String description;
	private String img1;
	private String src1;
	private String title1;
	private String description1;
	private String img2;
	private String src2;
	private String title2;
	private String description2;
	private String img3;
	private String src3;
	private String title3;
	private String description3;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
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
	public String getTitle1() {
		return title1;
	}
	public void setTitle1(String title1) {
		this.title1 = title1;
	}
	public String getDescription1() {
		return description1;
	}
	public void setDescription1(String description1) {
		this.description1 = description1;
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
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
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
	public String getTitle3() {
		return title3;
	}
	public void setTitle3(String title3) {
		this.title3 = title3;
	}
	public String getDescription3() {
		return description3;
	}
	public void setDescription3(String description3) {
		this.description3 = description3;
	}
	public home4() {
		super();
		// TODO Auto-generated constructor stub
	}
	public home4(Integer id, String img, String src, String title, String description, String img1, String src1,
			String title1, String description1, String img2, String src2, String title2, String description2,
			String img3, String src3, String title3, String description3) {
		super();
		this.id = id;
		this.img = img;
		this.src = src;
		this.title = title;
		this.description = description;
		this.img1 = img1;
		this.src1 = src1;
		this.title1 = title1;
		this.description1 = description1;
		this.img2 = img2;
		this.src2 = src2;
		this.title2 = title2;
		this.description2 = description2;
		this.img3 = img3;
		this.src3 = src3;
		this.title3 = title3;
		this.description3 = description3;
	}
	




}
