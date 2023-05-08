package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Bikecust;

public interface BikecustRepo extends JpaRepository<Bikecust,Integer> {
	Bikecust findByusername(String username);
}
