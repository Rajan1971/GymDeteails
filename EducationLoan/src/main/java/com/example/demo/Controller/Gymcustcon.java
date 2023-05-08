package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Gymcust;
import com.example.demo.service.GymCustser;

@RestController
public class Gymcustcon {
	@Autowired

	public GymCustser oser;

	@PostMapping( "/postt")
	public Gymcust addDe(@RequestBody Gymcust crc)
	{
		return oser.saveDe(crc);
	}
	@GetMapping("/getCa")
	public List <Gymcust> getDe()
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
