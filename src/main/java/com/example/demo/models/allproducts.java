package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class allproducts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

    private String productName;
    private String material;
    private Double price;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public allproducts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public allproducts(Long productId, String productName, String material, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.material = material;
		this.price = price;
	}
    

}
