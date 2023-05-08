package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Bikecust;
import com.example.demo.Repository.BikecustRepo;

@Service
public class BikeCustser {
	@Autowired
	public BikecustRepo rrepo;
	public Bikecust saveDe(Bikecust cc)
	{
		return rrepo.save(cc);
	}
	public List<Bikecust> getinfoDe()
	{
		return rrepo.findAll();
	}
	
	public String checkLogin(String username,String password)
	{
		Bikecust user= rrepo.findByusername(username);
		if(user==null)
		{
			return "No Registered user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Registration Succesfull";
			}
			else
			{
				return "Registration Failed";
			}
		}
	}

}
