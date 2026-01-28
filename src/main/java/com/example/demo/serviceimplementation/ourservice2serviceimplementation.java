package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice2;
import com.example.demo.repository.ourservice2repositpry;
import com.example.demo.service.ourservice2service;
@Service
public class ourservice2serviceimplementation implements ourservice2service {
@Autowired
ourservice2repositpry r3;
	@Override
	public String addour3(ourservice2 s3) {
		r3.save(s3);
		return "done";
	}

	@Override
	public List<ourservice2> getallour3() {
		// TODO Auto-generated method stub
		return r3.findAll();
	}

}
