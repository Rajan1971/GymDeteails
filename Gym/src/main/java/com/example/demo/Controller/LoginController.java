package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoginModel;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {
	@Autowired
	private LoginService lser;
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String usrname=loginData.get("usrname");
		String psword=loginData.get("psword");
		String result=lser.checkLogin(usrname,psword);
		return result;
	}
	@PostMapping("/addu")
	public LoginModel AddUser(@RequestBody LoginModel cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping
	public List<LoginModel> listAll()
	{
		return lser.getUser();
	}

}
