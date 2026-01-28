package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice1;
import com.example.demo.repository.ourservice1repository;
import com.example.demo.service.ourservice1service;
@Service
public class ourservice1serviceimplementation implements ourservice1service {
@Autowired
ourservice1repository r2;

	@Override
	public String addour1(ourservice1 o) {
		r2.save(o);
		return "yep";
	}

	@Override
	public List<ourservice1> getour1() {
		// TODO Auto-generated method stub
		return r2.findAll();
	}

}
