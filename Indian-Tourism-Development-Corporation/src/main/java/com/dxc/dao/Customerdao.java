package com.dxc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dxc.pojos.Bookroom;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Hotels;
import com.dxc.repository.Mongocustomer;

import com.dxc.repository.mongobook;
import com.dxc.repository.mongohotel;


@Repository
@Service
public class Customerdao {
	@Autowired
	Mongocustomer mo;
	@Autowired
	mongohotel mon;
	@Autowired
	mongobook mongo;
	
	Random random =new Random();
	public boolean lodindetails(Customer c) 
	{
	  mo.save(c);
	  
	   
		return true;
	}

	public boolean login(Customer c) {
		

		List<Customer> alist = new ArrayList<>();
		
        alist =  mo.findAll();
        System.out.println(alist.size());
        System.out.println(alist);
        for(int i=0;i<alist.size();i++)
        {
        Customer c1 = alist.get(i);
      
        if(c1.getCid()==(c.getCid()) && c1.getCpass().equals(c.getCpass()))
        {
            return true;
        }
        }
      
		
       return false;
	}
	public List<Hotels> gethotels() {
		List<Hotels> hlist = new ArrayList<>();
		hlist=mon.findAll();
		
		return hlist;
	}
	public List<Hotels> find(int hid)
	{
	
		List<Hotels> hlist = new ArrayList<>();
		hlist=mon.findHotelsByhid(hid);
		return hlist;
	}

	public boolean bookroom(Bookroom b, int hid, int cid) {
	     // Bookroom b=new Bookroom();
	      List<Customer> clist = mo.findCustomerBycid(cid);
	       
	               System.out.println(cid);
	       
	               Customer c = clist.get(0);
	           
	               b.setName(c.getName());
	               b.setCid(c.getCid());
	               b.setCphno(c.getCphno());
	               
	               List<Hotels> hlist =  new ArrayList<Hotels>();
	               hlist = mon.findHotelsByhid(hid);
	       
	            Hotels h = hlist.get(0);
	           b.setHid(hid);
	           b.setHname(h.getHname());
	           b.setHaddress(h.getHaddress());
	           
	           int originalrooms = h.getRooms();
	           int bookedrooms = b.getNoofrooms();
	          
	           
	          
	           
	         
	           
	            if(bookedrooms<originalrooms)
	            {
	                originalrooms = originalrooms - bookedrooms;
	                h.setRooms(originalrooms);
	                
	               
	                 mon.save(h);
	                 double cost=b.getNoofrooms()*h.getCost()*b.getDays();
	                
	               b.setTotalamount(cost);
	           
	               
	       int bid = random.nextInt(20);
	     
	               
	                b.setBookingid(bid);
	               b.setStatus("Booked");
	               System.out.println(b);
	                mongo.save(b);
	               
	                //mongo.insert(b);
	               
	                return true;
	            }
	            
	            
	            
	            
	            
	            else 
	            {
	                return false;
	            }
	
		
	}
	
	public List<Bookroom> showBookings(int cid)
    {
        List<Bookroom> blist = mongo.findBookroomBycid(cid);
        return blist;
   
    }
	 public List<Bookroom> requestCustomer(int bookid)
     {
         List<Bookroom> blist=new ArrayList<>();
         blist=mongo.findAll();
         for(Bookroom b:blist)
         {
                  if(bookid==b.getBookingid())
                 {    
                      b.setStatus("requesting for cancel room");
                      mongo.save(b);
                       return mongo.findBookingBybookingid(bookid);
                 }
         }
         return mongo.findBookingBybookingid(20);
     }

}
