package com.dxc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;  
import org.springframework.stereotype.Repository;

import com.dxc.pojos.admin;



@Repository
public interface Mangodo extends MongoRepository<admin, Integer>
{

	
}

