package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.GymModel;
import com.example.demo.Repository.GymRepository;
@Service

public class GymService
{
	@Autowired
    public GymRepository crepo;
	
	public GymModel saveInfo(GymModel c)
	{
		return crepo.save(c);
	}
	public List<GymModel> getInfo()
	{
		return crepo.findAll();
	}
	public GymModel updateInfo(GymModel iu)
	{
		return crepo.saveAndFlush(iu);
		
	}
	public void deleteInfo(int id )
	{
		crepo.deleteById(id);
	}
	public List <GymModel> sortDesc (String oname)
	{
		return crepo.findAll(Sort.by(oname).descending());
	}

	public List<GymModel> sortAsc (String oname)
	{
		return crepo.findAll(Sort.by(oname).ascending());
	}
	public List<GymModel> paginationData (int pageNu,int pageSize)
	{
		Page<GymModel> p=crepo.findAll (PageRequest.of(pageNu, pageSize));
		return p.getContent();
	}
}	
	