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

import com.example.demo.Model.BikeModel;
import com.example.demo.Repository.BikeRepository;
import com.example.demo.service.BikeService;

@RestController

public class BikeController 
{
	@Autowired
	public BikeService cser;
		
	@PostMapping("/postm")
	public BikeModel addDetails(@RequestBody BikeModel cr)
	{
		return cser.saveInfo(cr);
	}
	@GetMapping("/getma")
	public List <BikeModel> getDetails()
	{
		return cser.getInfo();
	}
	
	@PutMapping("/updatem")
	public BikeModel updateDetails(@RequestBody BikeModel bikenum)
	{
		return cser.updateInfo(bikenum);
	}
	
	@DeleteMapping("delete/{cid}")
	public String deleteDetails (@PathVariable ("cid") int bikenum)
	{
		cser.deleteInfo(bikenum);
		return "Bike number "+bikenum+" is deleted";
				
	}
	@DeleteMapping("/deleteReq")
	public String deleteByReq(@RequestParam ("cid") int bikenum)
	{
		cser.deleteInfo(bikenum);
		return "Bike number "+bikenum+" is deleted";
	}
	@GetMapping("/sortDesc/{oname}")
	public List<BikeModel> sortOwner(@PathVariable("oname") String bikename)
	{
		return cser.sortDesc(bikename);
	}

	@GetMapping("/sortAsc/{oname}")
	public List<BikeModel> sortOwnerasc(@PathVariable ("oname") String bikename)
	{
		return cser.sortAsc(bikename);
	}


	@GetMapping("/pagination/{pnu}/{psize}")
	public List <BikeModel> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
	{
		return cser.paginationData(pnu, psize);
	}
	@Autowired
	public BikeRepository ir;
	@GetMapping("/saveir")
	public List<BikeModel> getD()
	{
		return ir.getAllData();
	}

	@GetMapping("byName/{id}")
	public List<BikeModel> getName(@PathVariable ("id") int pid )
	{
		return ir.bybikenum(pid);
	}

	@GetMapping("startend/{start}/{end}")
	public List<BikeModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
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
	public List<BikeModel> jplQuery()
	{
		return ir.jpqlQ();
	}
	@GetMapping("/upp/{id}")
	public List<BikeModel> jpqUp(@PathVariable ("id") int id)
	{
		return ir.jqBYCon(id);
	}
}
