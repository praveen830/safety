package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ourservice4;
import com.example.demo.service.ourservice4service;
@RestController
@RequestMapping("/api/v2")
public class ourservice4controller {
@Autowired
ourservice4service s6;
@PostMapping("/setour6")
public String addour5(@RequestBody ourservice4 s5) {
	return s6.addour5(s5);
}
@GetMapping("/getour6")
public List<ourservice4> getallour5(){
	return s6.getallour5();
}

}
