package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.home;
import com.example.demo.service.homeservice;
@RequestMapping("api/v2/")
@RestController
public class homecontroller { 
	@Autowired
	homeservice ser;
	@PostMapping("/set")
	public String addhome( @RequestBody home h) {
		return ser.addhome(h);
	}
	@GetMapping("/get")
	public List<home> getallhome(){
		return ser.getallhome();
	}

}
