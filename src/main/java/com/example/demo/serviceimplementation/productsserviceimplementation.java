package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.products;
import com.example.demo.repository.productsrepository;
import com.example.demo.service.productsservice;
@Service
public class productsserviceimplementation implements productsservice {
@Autowired
productsrepository r;
	@Override
	public String addproducts(products p) {
		r.save(p);
		return "sucess";
	}

	@Override
	public List<products> getallproducts(){

		// TODO Auto-generated method stub
		return r.findAll();
	}

}
