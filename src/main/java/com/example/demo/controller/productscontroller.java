package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.products;
import com.example.demo.service.productsservice;
@RequestMapping("/api/v2")
@RestController
public class productscontroller {
	@Autowired
	productsservice s;
	@PostMapping("/setp")
	public String addproducts(@RequestBody products p) {
		
		return s.addproducts(p);
	}

	@GetMapping("/getp")
	public List<products> getallproducts(){

		// TODO Auto-generated method stub
		return s.getallproducts();
	}

	

}
