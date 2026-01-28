package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class ourservice2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String src;
	private String alt;
	private String data;
	private String src1;
	private String alt1;
	private String data1;
	private String src2;
	private String alt2;
	private String data2;
	private String src3;
	private String alt3;
	private String data3;
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
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
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
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
	public String getData3() {
		return data3;
	}
	public void setData3(String data3) {
		this.data3 = data3;
	}
	public ourservice2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ourservice2(Integer id, String title, String src, String alt, String data, String src1, String alt1,
			String data1, String src2, String alt2, String data2, String src3, String alt3, String data3) {
		super();
		this.id = id;
		this.title = title;
		this.src = src;
		this.alt = alt;
		this.data = data;
		this.src1 = src1;
		this.alt1 = alt1;
		this.data1 = data1;
		this.src2 = src2;
		this.alt2 = alt2;
		this.data2 = data2;
		this.src3 = src3;
		this.alt3 = alt3;
		this.data3 = data3;
	}
	

}
