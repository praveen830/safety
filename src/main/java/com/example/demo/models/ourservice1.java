package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ourservice1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String src;
	private String alt;
	private String title;
	private String description;
	private String src1;
	private String alt1;
	private String title1;
	private String description1;
	private String src2;
	private String alt2;
	private String title2;
	private String description2;
	private String src3;
	private String alt3;
	private String title3;
	private String description3;
	private String src4;
	private String alt4;
	private String title4;
	private String description4;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getSrc1() {
		return src1;
	}
	public void setSrc1(String src1) {
		this.src1 = src1;
	}
	public String getAlt1() {
		return alt1;
	}
	public void setAlt1(String alt1) {
		this.alt1 = alt1;
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
	public String getTitle4() {
		return title4;
	}
	public void setTitle4(String title4) {
		this.title4 = title4;
	}
	public String getDescription4() {
		return description4;
	}
	public void setDescription4(String description4) {
		this.description4 = description4;
	}
	public ourservice1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ourservice1(Integer id, String src, String alt, String title, String description, String src1, String alt1,
			String title1, String description1, String src2, String alt2, String title2, String description2,
			String src3, String alt3, String title3, String description3, String src4, String alt4, String title4,
			String description4) {
		super();
		this.id = id;
		this.src = src;
		this.alt = alt;
		this.title = title;
		this.description = description;
		this.src1 = src1;
		this.alt1 = alt1;
		this.title1 = title1;
		this.description1 = description1;
		this.src2 = src2;
		this.alt2 = alt2;
		this.title2 = title2;
		this.description2 = description2;
		this.src3 = src3;
		this.alt3 = alt3;
		this.title3 = title3;
		this.description3 = description3;
		this.src4 = src4;
		this.alt4 = alt4;
		this.title4 = title4;
		this.description4 = description4;
	}
	

}
