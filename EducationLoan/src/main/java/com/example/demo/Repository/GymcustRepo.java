package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Gymcust;

public interface GymcustRepo extends JpaRepository<Gymcust,Integer> {
	Gymcust findByusername(String username);
}
