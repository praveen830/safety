package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice6;
import com.example.demo.repository.ourservice6repository;
import com.example.demo.service.ourservice6service;
@Service
public class ourservice6serviceimplementation implements ourservice6service {
@Autowired
ourservice6repository r8;
	@Override
	public String addour8(ourservice6 s12) {
		// TODO Auto-generated method stub
		r8.save(s12);
		return "okdone";
	}

	@Override
	public List<ourservice6> getour8() {
		
		return r8.findAll();
	}

}
