package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.home5;
import com.example.demo.repository.home5repository;
import com.example.demo.service.home5service;
@Service
public class home5serviceimplementation implements home5service {
@Autowired
home5repository r5;

	@Override
	public String home5add(home5 h5) {
		r5.save(h5);
		return "yeah!";
	}

	@Override
	public List<home5> getallhome5() {
		
		return r5.findAll();
	}

}
