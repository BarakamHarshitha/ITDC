package com.dxc.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hotels {
	@Id
	private int hid;
	private String hname;
	private long hphno;
	private String haddress;
	private int rooms;
	
	private double cost;
	
	public Hotels()
	{
		
	}
	public Hotels(int hid, String hname, long hphno, String haddress, int rooms,  double cost
			) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hphno = hphno;
		this.haddress = haddress;
		this.rooms = rooms;
		
		this.cost = cost;
		
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public long getHphno() {
		return hphno;
	}
	public void setHphno(long hphno) {
		this.hphno = hphno;
	}
	public String getHaddress() {
		return haddress;
	}
	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}
	
	
	
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Hotels [hid=" + hid + ", hname=" + hname + ", hphno=" + hphno + ", haddress=" + haddress + ", rooms="
				+ rooms + ", cost=" + cost + "]";
	}
	
	

}
