package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice4;
import com.example.demo.repository.ourservice4repository;
import com.example.demo.service.ourservice4service;
@Service
public class ourservice4serviceimplementation implements ourservice4service {
@Autowired
ourservice4repository r5;
	@Override
	public String addour5(ourservice4 s5) {
		// TODO Auto-generated method stub
		r5.save(s5);
		return "go";
	}

	@Override
	public List<ourservice4> getallour5() {
		// TODO Auto-generated method stub
		return r5.findAll();
	}

}
