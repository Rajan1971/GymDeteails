package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Bikecust;
import com.example.demo.service.BikeCustser;

@RestController
public class Bikecustcon {
	@Autowired

	public BikeCustser oser;

	@PostMapping( "/postt")
	public Bikecust addDe(@RequestBody Bikecust crc)
	{
		return oser.saveDe(crc);
	}
	@GetMapping("/getCa")
	public List <Bikecust> getDe()
	{
		return oser.getinfoDe();
	} 
	@PostMapping("/register")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=oser.checkLogin(username,password);
		return result;
	}
}
