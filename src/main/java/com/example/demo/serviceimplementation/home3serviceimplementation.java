package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.home3;
import com.example.demo.repository.home3repository;
import com.example.demo.service.home3service;
@Service
public class home3serviceimplementation implements home3service {

	@Autowired
	home3repository r3;
	public String addhome3(home3 h3) {
		r3.save(h3);
		return "ok";
	}

	@Override
	public List<home3> getallhome3() {
		// TODO Auto-generated method stub
		return r3.findAll();
	}

}
