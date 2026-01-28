package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.home;
@Repository
public interface homerepository extends JpaRepository<home, Integer> {

}
