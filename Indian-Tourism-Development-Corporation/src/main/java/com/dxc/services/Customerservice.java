package com.dxc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.Customerdao;
import com.dxc.pojos.Bookroom;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Hotels;
@Service
public class Customerservice {
	@Autowired
	Customerdao dao;

	public boolean logindetails(Customer c) {
		// TODO Auto-generated method stub
		return dao.lodindetails(c);
	}

	public boolean login(Customer c) {
		// TODO Auto-generated method stub
		return dao.login(c);
	}

	public List<Hotels> gethotels() {
		// TODO Auto-generated method stub
		return dao.gethotels();
	}

	public List<Hotels> find(int hid) {
		// TODO Auto-generated method stub
		return dao.find(hid);
	}

	public boolean bookroom(Bookroom bookroom, int id, int cid) {
		// TODO Auto-generated method stub
		return dao.bookroom(bookroom,id,cid);
	}

	
	public List<Bookroom> showBookings(int cid) {
		// TODO Auto-generated method stub
		return dao.showBookings(cid);
	}

	public List<Bookroom> requestCustomer(int bookid) {
		// TODO Auto-generated method stub
		return dao.requestCustomer(bookid);
	}

}
