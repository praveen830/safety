package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.home1;
import com.example.demo.repository.home1repository;
import com.example.demo.service.Home1service;
@Service
public class Home1serviceimplementation implements Home1service {
@Autowired
home1repository r;
	@Override
	public String home1add(home1 h1) {
		r.save(h1);
		return "yep";
	}

	@Override
	public List<home1> home1getall() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

}
