package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.allproducts;
import com.example.demo.service.allproductsservice;
@RequestMapping("/api/v2")
@RestController
public class allproductscontroller {
	@Autowired
	allproductsservice s1;
	@PostMapping("/all")
	public String addallproducts(@RequestBody allproducts a) {
		return s1.addallproducts(a);
	}
	@GetMapping("/allget")
	public List<allproducts> getallall(){
		return s1.getallall();
		
	}

	

}
