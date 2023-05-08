package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.BikeModel;
import com.example.demo.Repository.BikeRepository;
@Service

public class BikeService
{
	@Autowired
    public BikeRepository crepo;
	
	public BikeModel saveInfo(BikeModel c)
	{
		return crepo.save(c);
	}
	public List<BikeModel> getInfo()
	{
		return crepo.findAll();
	}
	public BikeModel updateInfo(BikeModel iu)
	{
		return crepo.saveAndFlush(iu);
		
	}
	public void deleteInfo(int id )
	{
		crepo.deleteById(id);
	}
	public List <BikeModel> sortDesc (String oname)
	{
		return crepo.findAll(Sort.by(oname).descending());
	}

	public List<BikeModel> sortAsc (String oname)
	{
		return crepo.findAll(Sort.by(oname).ascending());
	}
	public List<BikeModel> paginationData (int pageNu,int pageSize)
	{
		Page<BikeModel> p=crepo.findAll (PageRequest.of(pageNu, pageSize));
		return p.getContent();
	}
}	
	