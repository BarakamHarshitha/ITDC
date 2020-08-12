package com.dxc.pojos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class admin {
	
	
	@Id
	private int adminid;
	private String name;
	private String pass;

	public admin()
	{
		
	}
	public admin(String name, int adminid, String pass) {
		super();
		this.name = name;
		this.adminid = adminid;
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "admin [adminid=" + adminid + ", name=" + name + ", pass=" + pass + "]";
	}
	
	
	
}