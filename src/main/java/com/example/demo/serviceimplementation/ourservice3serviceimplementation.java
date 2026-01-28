package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice3;
import com.example.demo.repository.ourservice3repository;
import com.example.demo.service.ourservice3service;
@Service
public class ourservice3serviceimplementation implements ourservice3service {
@Autowired
ourservice3repository r4;
	@Override
	public String addour4(ourservice3 s4) {
		r4.save(s4);
		return "save1";
	}

	@Override
	public List<ourservice3> getallour4() {
		// TODO Auto-generated method stub
		return r4.findAll();
	}

}
