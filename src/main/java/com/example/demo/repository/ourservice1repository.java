package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ourservice1;
@Repository

public interface ourservice1repository extends JpaRepository<ourservice1, Integer> {

}
