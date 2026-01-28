package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.allproducts;
import com.example.demo.repository.allproductsrepository;
import com.example.demo.service.allproductsservice;
@Service
public class allproductsserviceimplementation implements allproductsservice {
@Autowired
allproductsrepository a1;
	@Override
	public String addallproducts(allproducts a) {
		a1.save(a);
		return "yeah";
	}

	@Override
	public List<allproducts> getallall() {
		
		return a1.findAll();
	}

}
