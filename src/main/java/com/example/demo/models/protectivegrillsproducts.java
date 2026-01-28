package com.example.demo.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class protectivegrillsproducts {
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

	public allproducts getProduct() {
		return product;
	}

	public void setProduct(allproducts product) {
		this.product = product;
	}

	public protectivegrillsproducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public protectivegrillsproducts(Long id, String src, String alt, String title, String description, String material,
			String size, String warnanty, String rating, Double price, String checkbox, String checkboxs,
			allproducts product) {
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
		this.product = product;
	}
	

}
