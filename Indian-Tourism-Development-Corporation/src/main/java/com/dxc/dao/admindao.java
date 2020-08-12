package com.dxc.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dxc.pojos.Bookroom;
import com.dxc.pojos.Hotels;
import com.dxc.pojos.admin;
import com.dxc.repository.Mangodo;
import com.dxc.repository.mongobook;
import com.dxc.repository.mongohotel;
import com.mongodb.client.MongoCollection;

@Repository
@Service

public class admindao {
	
	@Autowired
	Mangodo mon;
	@Autowired
	mongohotel mo;
	@Autowired
	mongobook mongo;

	public boolean lodindetails(admin a) 
	{
	  mon.save(a);
	  
	   
		return true;
	}

	public boolean login(admin a) {
		
		
		List<admin> alist = new ArrayList<>();
		
        alist =  mon.findAll();
        System.out.println(alist.size());
        System.out.println(alist);
       
        
        for(int i=0;i<alist.size();i++)
        {
        	admin a1 = alist.get(i);
        if(a1.getAdminid()==(a.getAdminid()) && a1.getPass().equals(a.getPass()))
        {
            return true;
        }
        }
		
       return false;
	}

	public boolean adddetails(Hotels h) {
		mo.save(h);
		
		return true; 
	}

	public List<Hotels> getall() {
		List<Hotels> hlist = new ArrayList<>();
		hlist=mo.findAll();

		return hlist;
	}

	public List<Bookroom> showBookings()
    {
        List<Bookroom> blist = mongo.findAll();
        return blist;
   
    }
	public List<Bookroom> displayCancel()
    {
        List<Bookroom> b1=mongo.findBookingBystatus("requesting for cancel room");
        return b1;
    }
  public String displayDone()
    {
        List<Bookroom> b1=mongo.findAll();
        List<Hotels> h=mo.findAll();
        for(Bookroom b:b1)
        {
            if(b.getStatus().equals("requesting for cancel room"))
            {
                b.setStatus("cancelled!!!");
                mongo.save(b);
                for(Hotels h1:h)
                {
                	if(h1.getHid()==b.getHid())
                    {
                		int rooms=h1.getRooms();
                        
                        h1.setRooms(rooms);
                        
                        mo.save(h1);
                    }
                   
                }
                }
               
            }
       
       
        return "Successfully cancelled";
    }
	
	
	
	
}
