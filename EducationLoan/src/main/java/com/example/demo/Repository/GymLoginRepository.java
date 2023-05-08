package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.GymLoginModel;

public interface GymLoginRepository extends JpaRepository<GymLoginModel,Integer> {
	GymLoginModel findByusrname(String usrname);

}
