package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel,Integer> {
	LoginModel findByusrname(String usrname);

}
