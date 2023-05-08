package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.GymLoginModel;
import com.example.demo.Repository.GymLoginRepository;
@Service
public class GymLoginService {
	@Autowired
	private GymLoginRepository lrepo;
	public String checkLogin(String usrname,String psword)
	{
		GymLoginModel user= lrepo.findByusrname(usrname);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPsword().equals(psword))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public GymLoginModel addUser(GymLoginModel cl)
	{
		return lrepo.save(cl);
	}
	public List<GymLoginModel> getUser()
	{
		return lrepo.findAll();
	}

}
