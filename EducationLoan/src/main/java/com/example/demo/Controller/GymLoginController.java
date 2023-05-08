package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.GymLoginModel;
import com.example.demo.service.GymLoginService;

@RestController
@RequestMapping("/user")
public class GymLoginController {
	@Autowired
	private GymLoginService lser;
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String usrname=loginData.get("usrname");
		String psword=loginData.get("psword");
		String result=lser.checkLogin(usrname,psword);
		return result;
	}
	@PostMapping("/addu")
	public GymLoginModel AddUser(@RequestBody GymLoginModel cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping
	public List<GymLoginModel> listAll()
	{
		return lser.getUser();
	}

}
