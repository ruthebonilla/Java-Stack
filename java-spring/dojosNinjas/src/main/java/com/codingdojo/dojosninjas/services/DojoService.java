package com.codingdojo.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjas.models.Dojo;
import com.codingdojo.dojosninjas.repositories.DojoRepositories;




@Service
public class DojoService {
	private final DojoRepositories dojoRepo;

	public DojoService(DojoRepositories dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	
	//create a Dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	
	//find all Dojos
	public List<Dojo> findAll(){
		return dojoRepo.findAll();
	}
	
	
	//find one Dojo from Repo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optDojo = dojoRepo.findById(id);
		
		if(optDojo.isPresent()) {
			return optDojo.get();
		}else {
			return null;
		}
	}
	
	
	
	
	

}
