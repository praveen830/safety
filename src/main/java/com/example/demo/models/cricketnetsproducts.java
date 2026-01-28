package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class cricketnetsproducts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String src;
	private String alt;
	private String title;
	private String description;
	private String material;
	private String size;
	private String warnanty;
	private String rating;
	private Double price;
	private String checkbox;
	private String checkboxs;
	private String src1;
	private String alt1;
	private String title1;
	private String description1;
	private String material1;
	private String size1;
	private String warnanty1;
	private String rating1;
	private Double price1;
	private String checkbox1;
	private String checkboxs11;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn( name="productid")
	private allproducts product;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getWarnanty() {
		return warnanty;
	}
	public void setWarnanty(String warnanty) {
		this.warnanty = warnanty;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	public String getCheckboxs() {
		return checkboxs;
	}
	public void setCheckboxs(String checkboxs) {
		this.checkboxs = checkboxs;
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
	public String getMaterial1() {
		return material1;
	}
	public void setMaterial1(String material1) {
		this.material1 = material1;
	}
	public String getSize1() {
		return size1;
	}
	public void setSize1(String size1) {
		this.size1 = size1;
	}
	public String getWarnanty1() {
		return warnanty1;
	}
	public void setWarnanty1(String warnanty1) {
		this.warnanty1 = warnanty1;
	}
	public String getRating1() {
		return rating1;
	}
	public void setRating1(String rating1) {
		this.rating1 = rating1;
	}
	public Double getPrice1() {
		return price1;
	}
	public void setPrice1(Double price1) {
		this.price1 = price1;
	}
	public String getCheckbox1() {
		return checkbox1;
	}
	public void setCheckbox1(String checkbox1) {
		this.checkbox1 = checkbox1;
	}
	public String getCheckboxs11() {
		return checkboxs11;
	}
	public void setCheckboxs11(String checkboxs11) {
		this.checkboxs11 = checkboxs11;
	}
	public allproducts getProduct() {
		return product;
	}
	public void setProduct(allproducts product) {
		this.product = product;
	}
	public cricketnetsproducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cricketnetsproducts(Long id, String src, String alt, String title, String description, String material,
			String size, String warnanty, String rating, Double price, String checkbox, String checkboxs, String src1,
			String alt1, String title1, String description1, String material1, String size1, String warnanty1,
			String rating1, Double price1, String checkbox1, String checkboxs11, allproducts product) {
		super();
		this.id = id;
		this.src = src;
		this.alt = alt;
		this.title = title;
		this.description = description;
		this.material = material;
		this.size = size;
		this.warnanty = warnanty;
		this.rating = rating;
		this.price = price;
		this.checkbox = checkbox;
		this.checkboxs = checkboxs;
		this.src1 = src1;
		this.alt1 = alt1;
		this.title1 = title1;
		this.description1 = description1;
		this.material1 = material1;
		this.size1 = size1;
		this.warnanty1 = warnanty1;
		this.rating1 = rating1;
		this.price1 = price1;
		this.checkbox1 = checkbox1;
		this.checkboxs11 = checkboxs11;
		this.product = product;
	}
	

}
