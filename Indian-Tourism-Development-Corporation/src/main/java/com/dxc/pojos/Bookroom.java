package com.dxc.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bookroom {
	@Id
	private int bookingid;
	private int noofrooms;
	private int days;
	private String fromdate;
	private String todate;
	private double totalamount;
	private String status;
	private String hname;
	private int hid;
	private String haddress;
	  
	private String name;
	private  long cphno;
	private int cid;
	 
	public Bookroom() {}
	
	

	public Bookroom(int bookingid, int noofrooms,  int days, String fromdate, String todate,
			double totalamount, String hname, int hid, String haddress, String name, long cphno, int cid) {
		super();
		this.bookingid = bookingid;
		this.noofrooms = noofrooms;
		
		this.days = days;
		this.fromdate = fromdate;
		this.todate = todate;
		this.totalamount = totalamount;
		this.hname = hname;
		this.hid = hid;
		this.haddress = haddress;
		this.name = name;
		this.cphno = cphno;
		this.cid = cid;
	}

	public int getCid() {
		return cid;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public int getNoofrooms() {
		return noofrooms;
	}

	public void setNoofrooms(int noofrooms) {
		this.noofrooms = noofrooms;
	}

	
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getFromdate() {
		return fromdate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCphno() {
		return cphno;
	}

	public void setCphno(long cphno) {
		this.cphno = cphno;
	}



	@Override
	public String toString() {
		return "Bookroom [bookingid=" + bookingid + ", noofrooms=" + noofrooms + ", days=" + days + ", fromdate="
				+ fromdate + ", todate=" + todate + ", totalamount=" + totalamount + ", status=" + status + ", hname="
				+ hname + ", hid=" + hid + ", haddress=" + haddress + ", name=" + name + ", cphno=" + cphno + ", cid="
				+ cid + "]";
	}

	

	
	
	

}
