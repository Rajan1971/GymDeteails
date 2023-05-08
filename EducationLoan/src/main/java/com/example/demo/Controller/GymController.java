package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;        
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.GymModel;
import com.example.demo.Repository.GymRepository;
import com.example.demo.service.GymService;

@RestController

public class GymController 
{
	@Autowired
	public GymService cser;
		
	@PostMapping("/postm")
	public GymModel addDetails(@RequestBody GymModel cr)
	{
		return cser.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <GymModel> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/updatem")
	public GymModel updateDetails(@RequestBody GymModel custnum)
	{
		return cser.updateInfo(custnum);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int custnum)
	{
		cser.deleteInfo(custnum);
		return "custnum "+custnum+" is deleted";
				
	}
	@DeleteMapping("/deleteReq")
	public String deleteByReq(@RequestParam ("cid") int custnum)
	{
		cser.deleteInfo(custnum);
		return "custnum "+custnum+" is deleted";
	}
	@GetMapping("/sortDesc/{oname}")
	public List<GymModel> sortOwner(@PathVariable("oname") String custname)
	{
		return cser.sortDesc(custname);
	}

	@GetMapping("/sortAsc/{oname}")
	public List<GymModel> sortOwnerasc(@PathVariable ("oname") String custname)
	{
		return cser.sortAsc(custname);
	}


	@GetMapping("/pagination/{pnu}/{psize}")
	public List <GymModel> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
	{
		return cser.paginationData(pnu, psize);
	}
	@Autowired
	public GymRepository ir;
	@GetMapping("/saveir")
	public List<GymModel> getD()
	{
		return ir.getAllData();
	}

	@GetMapping("byName/{id}")
	public List<GymModel> getName(@PathVariable ("id") int pid )
	{
		return ir.bycustnum(pid);
	}

	@GetMapping("startend/{start}/{end}")
	public List<GymModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
	{
		return ir.startEnd(start, end);
	}

	@DeleteMapping("/del/{id}/{name}")
	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
	{
		ir.deleteD(id, name);
		return "deleted";
	}

	@PutMapping("updatee/{pid}/{pname}")
	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
	{
		ir.updateByQuery(pid, pname);
	}
	@GetMapping("jp")
	public List<GymModel> jplQuery()
	{
		return ir.jpqlQ();
	}
	@GetMapping("/upp/{id}")
	public List<GymModel> jpqUp(@PathVariable ("id") int id)
	{
		return ir.jqBYCon(id);
	}
}
