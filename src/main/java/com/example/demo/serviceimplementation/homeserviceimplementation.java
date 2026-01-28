package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.home;
import com.example.demo.repository.homerepository;
import com.example.demo.service.homeservice;
@Service
public    class homeserviceimplementation implements homeservice {
@Autowired
homerepository rp;
	public String addhome(home h) {
		rp.save(h);
		// TODO Auto-generated method stub
		return "done";
	}

      public List<home> getallhome() {
		// TODO Auto-generated method stub
		return rp.findAll();
	}

	 

}
