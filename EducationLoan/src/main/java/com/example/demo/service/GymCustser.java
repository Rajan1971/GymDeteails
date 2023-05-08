package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Gymcust;
import com.example.demo.Repository.GymcustRepo;

@Service
public class GymCustser {
	@Autowired
	public GymcustRepo rrepo;
	public Gymcust saveDe(Gymcust cc)
	{
		return rrepo.save(cc);
	}
	public List<Gymcust> getinfoDe()
	{
		return rrepo.findAll();
	}
	
	public String checkLogin(String username,String password)
	{
		Gymcust user= rrepo.findByusername(username);
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
