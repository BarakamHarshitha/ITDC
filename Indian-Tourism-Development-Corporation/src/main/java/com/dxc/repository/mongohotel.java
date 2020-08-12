package com.dxc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dxc.pojos.Hotels;

@Repository
public interface mongohotel extends MongoRepository<Hotels, Integer>
{
	public List<Hotels> findHotelsByhid(int a); 

}
