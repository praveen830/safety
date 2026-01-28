package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ourservice;
import com.example.demo.repository.ourservicerepository;
import com.example.demo.service.ourserviceservice;
@Service
public class ourserviceserviceimplementation implements ourserviceservice {
@Autowired
ourservicerepository r1;
	@Override
	public String addour(ourservice s) {
		r1.save(s);
		return "hmm";
	}

	@Override
	public List<ourservice> getour() {
		// TODO Auto-generated method stub
		return r1.findAll();
	}

}
