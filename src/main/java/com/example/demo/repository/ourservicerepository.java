package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ourservice;
@Repository
public interface ourservicerepository extends JpaRepository<ourservice, Integer>{

}
