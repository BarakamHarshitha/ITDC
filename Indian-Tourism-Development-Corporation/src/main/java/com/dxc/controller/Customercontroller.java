package com.dxc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.pojos.Bookroom;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Hotels;
import com.dxc.services.Customerservice;

@Controller
@RequestMapping("/views")
public class Customercontroller {
	@Autowired
    Customerservice service;
	
	@RequestMapping("/clog")
	public String login(@ModelAttribute Customer c,Model m,HttpSession session)
	{  
	int cid=c.getCid();
		session.setAttribute("cid",cid);
	    boolean abc=service.login(c); 
	    if(abc==true)
	    {
	    	String login="LOGIN AS Customer";
	    	m.addAttribute("login",login);
	    	return "customermenu";
	    }
	    else
	    {
	   
	    	String fail="INVALID CREDENTIALS";
	    	m.addAttribute("abc",fail);
	    }
	     
	     return "message";
	}
	@RequestMapping("/clogin")
	public String adminlogin(@ModelAttribute Customer c,Model m)
	{   
        System.out.println(c);
		
	    boolean abc=service.logindetails(c); 
	    if(abc==true)
	    {
	    	String login="Customer ADDED SUCESSFULLY";
	    	m.addAttribute("abc",login);
	    	return "message";
	    }
	    else
	    {
	   
	    	String fail="INVALID CREDENTIALS";
	    	m.addAttribute("abc",fail);
	    }
	     
	     return "message";
	}
	@RequestMapping("/display")
 	public String gethotel(Model model)
 	{
 		List<Hotels> list=service.gethotels();
 		System.out.println(list);
 		model.addAttribute("list", list);
 		return "display";
 	}
	@RequestMapping("/get")
	public String find(@RequestParam int hid,Model model,HttpSession session)
	{
		session.setAttribute("id",hid);
		
		List<Hotels> list=service.find(hid);
 		System.out.println(list);
 		model.addAttribute("list", list);
 		return "get";
	}
	@RequestMapping("/bookaroom")
    public String bookRoom(@ModelAttribute Bookroom bookroom,Model m,HttpSession session)
    {
        int id = (int) session.getAttribute("id");
       
        int cid = (int) session.getAttribute("cid");
       
        boolean b = service.bookroom(bookroom,id,cid);
       
       
        if(b)
        {
           String message="Room Booked Successfully!!";
            m.addAttribute("abc",message);
            return "message";   
        }
        else
        {
           String message="Insufficent Rooms:(......!";
            m.addAttribute("abc",message);   
            return "message";
        }
    }
	@RequestMapping("/showbookings")
	public String showbookings(Model m,HttpSession session)
	{
		
		int cid=(int)session.getAttribute("cid");
		List<Bookroom> blist=service.showBookings(cid);
		if(blist.isEmpty())
		{
			String message="No active Bookings";
					m.addAttribute("abc",message);
					return "message";
		}
		else
		{
			m.addAttribute("list",blist);
			return "showbookings";
		}
		
	}
	 @RequestMapping("/requestcancelbooking")
	    public String requestforcancellation(@RequestParam int bookingid,Model m,HttpSession session)
	    {
	        List<Bookroom> blist=service.requestCustomer(bookingid);
	        System.out.println(blist);
	       
	        if(!(blist.isEmpty()))
	        {
	       String message="REQUEST SENT TO ADMIN FOR CANCELATION OF BOOKING";
	        m.addAttribute("abc", message);
	        return "message";
	        }
	        else
	        {
	          String  message="INVALID BOOK ID";
	            m.addAttribute("abc", message);
	            return "message";
	        }
	       
	    }
	
}
