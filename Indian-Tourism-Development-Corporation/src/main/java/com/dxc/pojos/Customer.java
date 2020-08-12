package com.dxc.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
	private int cid;
	private String name;
	private long cphno;
	private String cpass;
	private long aadharcard;
	public Customer()
	{
		
	}
	public Customer(int cid, String name, long cphno, String cpass, long aadharcard) {
		super();
		this.cid = cid;
		this.name = name;
		this.cphno = cphno;
		this.cpass = cpass;
		this.aadharcard = aadharcard;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
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
	public String getCpass() {
		return cpass;
	}
	public void setCpass(String cpass) {
		this.cpass = cpass;
	}
	public long getAadharcard() {
		return aadharcard;
	}
	public void setAadharcard(long aadharcard) {
		this.aadharcard = aadharcard;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", cphno=" + cphno + ", cpass=" + cpass + ", aadharcard="
				+ aadharcard + "]";
	}
	
}
