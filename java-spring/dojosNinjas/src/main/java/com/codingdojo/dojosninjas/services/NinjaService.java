package com.codingdojo.dojosninjas.services;



import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosninjas.models.Ninja;
import com.codingdojo.dojosninjas.repositories.NinjaRepositories;

@Service
public class NinjaService {

	private NinjaRepositories ninjaRepo;
	
	public NinjaService(NinjaRepositories ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	
	//create a Ninja
		public Ninja createNinja(Ninja ninja) {
			return ninjaRepo.save(ninja);
		}
	

	//find all Ninjas
		public List<Ninja> findAll() {
			return ninjaRepo.findAll();
		}
	

}
