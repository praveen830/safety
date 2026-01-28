package com.example.demo.service;

import java.util.List;

import com.example.demo.models.products;

public interface productsservice {
	public String addproducts(products p);
	public List<products> getallproducts();

}
