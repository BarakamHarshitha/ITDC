package com.dxc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.pojos.Bookroom;

public interface mongobook extends MongoRepository<Bookroom, Integer>{
     public List<Bookroom> findBookroomBycid(int i);
    
     public List<Bookroom> findBookingBybookingid(int s);
     public List<Bookroom> findBookingBystatus(String s);
}
   


  