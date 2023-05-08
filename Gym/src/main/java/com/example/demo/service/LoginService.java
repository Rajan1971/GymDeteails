package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoginModel;
import com.example.demo.Repository.LoginRepository;
@Service
public class LoginService {
	@Autowired
	private LoginRepository lrepo;
	public String checkLogin(String usrname,String psword)
	{
		LoginModel user= lrepo.findByusrname(usrname);
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
	public LoginModel addUser(LoginModel cl)
	{
		return lrepo.save(cl);
	}
	public List<LoginModel> getUser()
	{
		return lrepo.findAll();
	}

}
