package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice5;
import com.example.demo.repository.ourservice5repository;
import com.example.demo.service.ourservice5service;
@Service
public class ourservice5serviceimplementation implements ourservice5service {
@Autowired
ourservice5repository r6;
	@Override
	public String addour7(ourservice5 s6) {
		// TODO Auto-generated method stub
		r6.save(s6);
		return "okgo";
	}

	@Override
	public List<ourservice5> getallour7() {
		// TODO Auto-generated method stub
		return r6.findAll();
	}

}
