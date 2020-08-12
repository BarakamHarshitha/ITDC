package com.dxc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dao.admindao;
import com.dxc.pojos.Bookroom;
import com.dxc.pojos.Hotels;
import com.dxc.pojos.admin;
@Service
public class Adminservice {
	@Autowired
	admindao dao;

	public boolean logindetails(admin a) {
		// TODO Auto-generated method stub
		return dao.lodindetails(a);
	}

	public boolean login(admin a) {
		// TODO Auto-generated method stub
		return dao.login(a);
	}

	public boolean adddetails(Hotels h) {
		// TODO Auto-generated method stub
		return dao.adddetails(h);
	}
	public List<Hotels> getall() {
		return dao.getall();
		
	}

	public List<Bookroom> showBookings() {
		// TODO Auto-generated method stub
		return dao.showBookings();
	}

	public List<Bookroom> displayCancel() {
		// TODO Auto-generated method stub
		return dao.displayCancel();
	}

	public String displayDone() {
		// TODO Auto-generated method stub
		return dao.displayDone();
	}

	

}
