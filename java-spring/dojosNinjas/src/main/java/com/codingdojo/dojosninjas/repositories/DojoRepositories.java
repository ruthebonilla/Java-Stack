package com.codingdojo.dojosninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojosninjas.models.Dojo;



@Repository
public interface DojoRepositories extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
